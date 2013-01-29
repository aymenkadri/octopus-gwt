package com.sfeir.octopus.back.client.activity;



import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.sfeir.octopus.back.client.place.*;
import com.sfeir.octopus.back.client.ui.menu.MenuView;

public class MenuActivity extends AbstractActivity implements MenuView.Presenter {

	@Inject
	private PlaceController placeController;

	@Inject
	private MenuView view;
	
	@Inject
	private IncomePlace itemsPlace;
	
	@Inject
	private AddOnsPlace addOnsPlace;
	
	@Inject
	private StatisticsPlace statisticsPlace;

    @Inject
    private MapPlace mapPlace;

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
	}

	@Override
	public void goTo(final Place place) {
		placeController.goTo(place);
	}

	@Override
	public void goToItemsPlace() {
		goTo(itemsPlace);
	}

	@Override
	public void goToAddOnsPlace() {
		goTo(addOnsPlace);
	}

	@Override
	public void goToStatisticsPlace() {
		goTo(statisticsPlace);
	}

    @Override
    public void goToMapPlace() {
        goTo(mapPlace);
    }

	@Override
	public void disconnect() {
		Window.alert("Disconnected");
	}

}
