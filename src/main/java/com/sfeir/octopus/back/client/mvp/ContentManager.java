package com.sfeir.octopus.back.client.mvp;


import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.sfeir.octopus.back.client.activity.MenuActivity;

public class ContentManager implements PlaceChangeEvent.Handler {

	private AcceptsOneWidget display;

	@Inject
	private Provider<MenuActivity> menuActivityProvider;

	@Inject
	private EventBus eventBus;

	@Override
	public void onPlaceChange(final PlaceChangeEvent event) {

		final MenuActivity menuActivity = menuActivityProvider.get();
		menuActivity.start(display, eventBus);

	}

	public void setDisplay(final AcceptsOneWidget simplePanel) {
		display = simplePanel;
		eventBus.addHandler(PlaceChangeEvent.TYPE, this);
	}

}
