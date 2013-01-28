package com.sfeir.octopus.back.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ArchivesPlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<ArchivesPlace> {

		@Override
		public String getToken(final ArchivesPlace place) {
			return "";
		}

		@Override
		public ArchivesPlace getPlace(final String token) {
			return new ArchivesPlace();
		}

	}
}
