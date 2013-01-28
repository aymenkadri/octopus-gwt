package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class AddOnsPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<AddOnsPlace> {

		@Override
		public String getToken(final AddOnsPlace place) {
			return "";
		}

		@Override
		public AddOnsPlace getPlace(final String token) {
			return new AddOnsPlace();
		}

	}
}
