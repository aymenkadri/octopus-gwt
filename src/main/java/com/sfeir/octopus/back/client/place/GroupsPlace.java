package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class GroupsPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<GroupsPlace> {

		@Override
		public String getToken(final GroupsPlace place) {
			return "";
		}

		@Override
		public GroupsPlace getPlace(final String token) {
			return new GroupsPlace();
		}

	}
}
