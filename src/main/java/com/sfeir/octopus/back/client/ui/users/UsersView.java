package com.sfeir.octopus.back.client.ui.users;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface UsersView extends IsWidget {

	void setPresenter(Presenter listener);

	public interface Presenter {

		void goTo(Place place);
	}
}
