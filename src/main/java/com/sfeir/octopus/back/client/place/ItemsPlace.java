package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ItemsPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<ItemsPlace> {

		@Override
		public String getToken(final ItemsPlace place) {
			return "";
		}

		@Override
		public ItemsPlace getPlace(final String token) {
			return new ItemsPlace();
		}

	}
}
