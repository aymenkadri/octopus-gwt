package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class IncomePlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<IncomePlace> {

		@Override
		public String getToken(final IncomePlace place) {
			return "";
		}

		@Override
		public IncomePlace getPlace(final String token) {
			return new IncomePlace();
		}

	}
}
