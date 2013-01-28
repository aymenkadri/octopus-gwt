package com.sfeir.octopus.back.client.mvp;


import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.sfeir.octopus.back.client.activity.AddOnsActivity;
import com.sfeir.octopus.back.client.activity.ArchivesActivity;
import com.sfeir.octopus.back.client.activity.GroupsActivity;
import com.sfeir.octopus.back.client.activity.HomeActivity;
import com.sfeir.octopus.back.client.activity.ItemsActivity;
import com.sfeir.octopus.back.client.activity.NewslettersActivity;
import com.sfeir.octopus.back.client.activity.ProfilesActivity;
import com.sfeir.octopus.back.client.activity.PublishActivity;
import com.sfeir.octopus.back.client.activity.StatisticsActivity;
import com.sfeir.octopus.back.client.activity.UsersActivity;
import com.sfeir.octopus.back.client.place.AddOnsPlace;
import com.sfeir.octopus.back.client.place.ArchivesPlace;
import com.sfeir.octopus.back.client.place.GroupsPlace;
import com.sfeir.octopus.back.client.place.HomePlace;
import com.sfeir.octopus.back.client.place.ItemsPlace;
import com.sfeir.octopus.back.client.place.NewslettersPlace;
import com.sfeir.octopus.back.client.place.ProfilesPlace;
import com.sfeir.octopus.back.client.place.PublishPlace;
import com.sfeir.octopus.back.client.place.StatisticsPlace;
import com.sfeir.octopus.back.client.place.UsersPlace;

public class AppActivityMapper implements ActivityMapper {

	@Inject
	Provider<HomeActivity> homeActivityProvider;
	
	@Inject
	Provider<AddOnsActivity> addOnsActivityProvider;
	
	@Inject
	Provider<ArchivesActivity> archivesActivityProvider;
	
	@Inject
	Provider<GroupsActivity> groupsActivityProvider;
	
	@Inject
	Provider<ItemsActivity> itemsActivityProvider;
	
	@Inject
	Provider<NewslettersActivity> newslettersActivityProvider;
	
	@Inject
	Provider<ProfilesActivity> profilesActivityProvider;
	
	@Inject
	Provider<PublishActivity> publishActivityProvider;
	
	@Inject
	Provider<StatisticsActivity> statisticsActivityProvider;
	
	@Inject
	Provider<UsersActivity> usersActivityProvider;

	@Override
	public Activity getActivity(final Place place) {
		if (place instanceof HomePlace) {
			return homeActivityProvider.get().setPlace(place);
		}
		if (place instanceof PublishPlace) {
			return publishActivityProvider.get().setPlace(place);
		}
		if (place instanceof AddOnsPlace) {
			return addOnsActivityProvider.get().setPlace(place);
		}
		if (place instanceof ArchivesPlace) {
			return archivesActivityProvider.get().setPlace(place);
		}
		if (place instanceof GroupsPlace) {
			return groupsActivityProvider.get().setPlace(place);
		}
		if (place instanceof ItemsPlace) {
			return itemsActivityProvider.get().setPlace(place);
		}
		if (place instanceof NewslettersPlace) {
			return newslettersActivityProvider.get().setPlace(place);
		}
		if (place instanceof ProfilesPlace) {
			return profilesActivityProvider.get().setPlace(place);
		}
		if (place instanceof StatisticsPlace) {
			return statisticsActivityProvider.get().setPlace(place);
		}
		if (place instanceof UsersPlace) {
			return usersActivityProvider.get().setPlace(place);
		}

		return null;
	}

}
