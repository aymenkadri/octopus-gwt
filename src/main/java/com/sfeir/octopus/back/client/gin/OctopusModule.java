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
import com.sfeir.octopus.back.client.ui.archives.ArchivesView;
import com.sfeir.octopus.back.client.ui.archives.ArchivesViewImpl;
import com.sfeir.octopus.back.client.ui.groups.GroupsView;
import com.sfeir.octopus.back.client.ui.groups.GroupsViewImpl;
import com.sfeir.octopus.back.client.ui.home.HomeView;
import com.sfeir.octopus.back.client.ui.home.HomeViewImpl;
import com.sfeir.octopus.back.client.ui.items.ItemsView;
import com.sfeir.octopus.back.client.ui.items.ItemsViewImpl;
import com.sfeir.octopus.back.client.ui.menu.MenuView;
import com.sfeir.octopus.back.client.ui.menu.MenuViewImpl;
import com.sfeir.octopus.back.client.ui.newsletters.NewslettersView;
import com.sfeir.octopus.back.client.ui.newsletters.NewslettersViewImpl;
import com.sfeir.octopus.back.client.ui.profiles.ProfilesView;
import com.sfeir.octopus.back.client.ui.profiles.ProfilesViewImpl;
import com.sfeir.octopus.back.client.ui.publishing.PublishView;
import com.sfeir.octopus.back.client.ui.publishing.PublishViewImpl;
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
		bind(ArchivesView.class).to(ArchivesViewImpl.class).in(Singleton.class);
		bind(GroupsView.class).to(GroupsViewImpl.class).in(Singleton.class);
		bind(ItemsView.class).to(ItemsViewImpl.class).in(Singleton.class);
		bind(NewslettersView.class).to(NewslettersViewImpl.class).in(Singleton.class);
		bind(ProfilesView.class).to(ProfilesViewImpl.class).in(Singleton.class);
		bind(PublishView.class).to(PublishViewImpl.class).in(Singleton.class);
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
