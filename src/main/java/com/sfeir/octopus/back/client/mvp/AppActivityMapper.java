package com.sfeir.octopus.back.client.mvp;


import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.sfeir.octopus.back.client.activity.*;
import com.sfeir.octopus.back.client.place.*;

public class AppActivityMapper implements ActivityMapper {

	@Inject
	Provider<HomeActivity> homeActivityProvider;
	
	@Inject
	Provider<AddOnsActivity> addOnsActivityProvider;

	@Inject
	Provider<IncomeActivity> incomeActivityProvider;

	@Inject
	Provider<MapActivity> mapActivityProvider;
	
	@Inject
	Provider<StatisticsActivity> statisticsActivityProvider;
	
	@Inject
	Provider<UsersActivity> usersActivityProvider;

	@Override
	public Activity getActivity(final Place place) {
		if (place instanceof HomePlace) {
			return homeActivityProvider.get().setPlace(place);
		}
		if (place instanceof MapPlace) {
			return mapActivityProvider.get().setPlace(place);
		}
		if (place instanceof AddOnsPlace) {
			return addOnsActivityProvider.get().setPlace(place);
		}
		if (place instanceof IncomePlace) {
			return incomeActivityProvider.get().setPlace(place);
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
