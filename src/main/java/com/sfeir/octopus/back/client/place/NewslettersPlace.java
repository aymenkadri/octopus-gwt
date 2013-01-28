package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class NewslettersPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<NewslettersPlace> {

		@Override
		public String getToken(final NewslettersPlace place) {
			return "";
		}

		@Override
		public NewslettersPlace getPlace(final String token) {
			return new NewslettersPlace();
		}

	}
}
