package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ProfilesPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<ProfilesPlace> {

		@Override
		public String getToken(final ProfilesPlace place) {
			return "";
		}

		@Override
		public ProfilesPlace getPlace(final String token) {
			return new ProfilesPlace();
		}

	}
}
