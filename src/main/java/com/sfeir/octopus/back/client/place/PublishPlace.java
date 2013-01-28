package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PublishPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<PublishPlace> {

		@Override
		public String getToken(final PublishPlace place) {
			return "";
		}

		@Override
		public PublishPlace getPlace(final String token) {
			return new PublishPlace();
		}

	}
}
