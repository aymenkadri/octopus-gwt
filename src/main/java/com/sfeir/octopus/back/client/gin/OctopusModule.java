package com.sfeir.octopus.back.client.gin;


import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.sfeir.octopus.back.client.mvp.AppActivityMapper;
import com.sfeir.octopus.back.client.mvp.AppPlaceController;
import com.sfeir.octopus.back.client.mvp.AppPlaceHistoryMapper;
import com.sfeir.octopus.back.client.place.HomePlace;
import com.sfeir.octopus.back.client.ui.addOns.AddOnsView;
import com.sfeir.octopus.back.client.ui.addOns.AddOnsViewImpl;
import com.sfeir.octopus.back.client.ui.home.HomeView;
import com.sfeir.octopus.back.client.ui.home.HomeViewImpl;
import com.sfeir.octopus.back.client.ui.incomes.IncomeView;
import com.sfeir.octopus.back.client.ui.incomes.IncomeViewImpl;
import com.sfeir.octopus.back.client.ui.maps.MapsView;
import com.sfeir.octopus.back.client.ui.maps.MapsViewImpl;
import com.sfeir.octopus.back.client.ui.menu.MenuView;
import com.sfeir.octopus.back.client.ui.menu.MenuViewImpl;
import com.sfeir.octopus.back.client.ui.statistics.StatisticsView;
import com.sfeir.octopus.back.client.ui.statistics.StatisticsViewImpl;
import com.sfeir.octopus.back.client.ui.users.UsersView;
import com.sfeir.octopus.back.client.ui.users.UsersViewImpl;

public class OctopusModule extends AbstractGinModule {

	@Override
	protected void configure() {

		// MVP
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(ActivityMapper.class).to(AppActivityMapper.class).in(Singleton.class);
		bind(AppPlaceHistoryMapper.class).in(Singleton.class);

		bind(HomeView.class).to(HomeViewImpl.class).in(Singleton.class);
		bind(MenuView.class).to(MenuViewImpl.class).in(Singleton.class);
		bind(AddOnsView.class).to(AddOnsViewImpl.class).in(Singleton.class);
		bind(IncomeView.class).to(IncomeViewImpl.class).in(Singleton.class);
		bind(MapsView.class).to(MapsViewImpl.class).in(Singleton.class);
		bind(StatisticsView.class).to(StatisticsViewImpl.class).in(Singleton.class);
		bind(UsersView.class).to(UsersViewImpl.class).in(Singleton.class);
	}

	@Singleton
	@Provides
	ActivityManager getActivityManager(final ActivityMapper activityMapper, final EventBus eventBus) {
		return new ActivityManager(activityMapper, eventBus);
	}

	@Singleton
	@Provides
	PlaceController getPlaceController(final EventBus eventBus) {
		return new AppPlaceController(eventBus);
	}

	@Singleton
	@Provides
	PlaceHistoryHandler getPlaceHistoryHandler(final AppPlaceHistoryMapper historyMapper, final EventBus eventBus, final PlaceController placeController) {
		final PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, new HomePlace());
		return historyHandler;
	}

}
