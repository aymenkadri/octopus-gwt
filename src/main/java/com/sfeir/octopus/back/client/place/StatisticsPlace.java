package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class StatisticsPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<StatisticsPlace> {

		@Override
		public String getToken(final StatisticsPlace place) {
			return "";
		}

		@Override
		public StatisticsPlace getPlace(final String token) {
			return new StatisticsPlace();
		}

	}
}
