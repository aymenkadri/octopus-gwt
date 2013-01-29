package com.sfeir.octopus.back.client.activity;



import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.sfeir.octopus.back.client.mvp.HasPlace;
import com.sfeir.octopus.back.client.place.MapPlace;
import com.sfeir.octopus.back.client.ui.maps.MapsView;

public class MapActivity extends AbstractActivity implements HasPlace, MapsView.Presenter {

    @Inject
    private MapsView view;

    @Inject
    private PlaceController placeController;

    private MapPlace place;

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
    public Activity setPlace(final Place place) {
        this.place = (MapPlace) place;
        return this;
    }

}
