package com.sfeir.octopus.back.client.mvp;


import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.sfeir.octopus.back.client.place.AddOnsPlace;
import com.sfeir.octopus.back.client.place.ArchivesPlace;
import com.sfeir.octopus.back.client.place.GroupsPlace;
import com.sfeir.octopus.back.client.place.HomePlace;
import com.sfeir.octopus.back.client.place.ItemsPlace;
import com.sfeir.octopus.back.client.place.NewslettersPlace;
import com.sfeir.octopus.back.client.place.ProfilesPlace;
import com.sfeir.octopus.back.client.place.PublishPlace;
import com.sfeir.octopus.back.client.place.StatisticsPlace;
import com.sfeir.octopus.back.client.place.UsersPlace;

@WithTokenizers({ //
	HomePlace.Tokenizer.class, //
	AddOnsPlace.Tokenizer.class, //
	ArchivesPlace.Tokenizer.class, //
	GroupsPlace.Tokenizer.class, //
	ItemsPlace.Tokenizer.class, //
	NewslettersPlace.Tokenizer.class, //
	ProfilesPlace.Tokenizer.class, //
	PublishPlace.Tokenizer.class, //
	StatisticsPlace.Tokenizer.class, //
	UsersPlace.Tokenizer.class //
})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
