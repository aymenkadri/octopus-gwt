package com.sfeir.octopus.back.client.mvp;


import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.sfeir.octopus.back.client.place.*;

@WithTokenizers({ //
	HomePlace.Tokenizer.class, //
	AddOnsPlace.Tokenizer.class, //
    IncomePlace.Tokenizer.class, //
	MapPlace.Tokenizer.class, //
	StatisticsPlace.Tokenizer.class, //
	UsersPlace.Tokenizer.class //
})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
