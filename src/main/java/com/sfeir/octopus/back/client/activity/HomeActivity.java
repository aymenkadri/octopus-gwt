package com.sfeir.octopus.back.client.activity;



import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.sfeir.octopus.back.client.mvp.HasPlace;
import com.sfeir.octopus.back.client.place.HomePlace;
import com.sfeir.octopus.back.client.rpc.InitializationServiceAsync;
import com.sfeir.octopus.back.client.ui.home.HomeView;

public class HomeActivity extends AbstractActivity implements HasPlace, HomeView.Presenter {

	@Inject
	private HomeView view;

	@Inject
	private PlaceController placeController;
	
	@Inject
	private InitializationServiceAsync initializationService;

	private HomePlace place;

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
		
		initializationService.initTest(new AsyncCallback<Void>() {
			
			@Override
			public void onSuccess(Void result) {
				Window.alert("Success");
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fail : " + caught.toString());
			}
		});
	}

	@Override
	public void goTo(final Place place) {
		placeController.goTo(place);
	}

	@Override
	public Activity setPlace(final Place place) {
		this.place = (HomePlace) place;
		return this;
	}

}
