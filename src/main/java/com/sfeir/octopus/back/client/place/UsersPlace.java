package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class UsersPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<UsersPlace> {

		@Override
		public String getToken(final UsersPlace place) {
			return "";
		}

		@Override
		public UsersPlace getPlace(final String token) {
			return new UsersPlace();
		}

	}
}
