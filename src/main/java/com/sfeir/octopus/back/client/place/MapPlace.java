package com.sfeir.macabe2012.client.maps;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MapPlace extends Place {

    public static class Tokenizer  implements PlaceTokenizer<MapPlace>{

        public MapPlace getPlace(String arg0) {
            return new MapPlace();
        }

        public String getToken(MapPlace arg0) {
            return "";
        }
    }
}