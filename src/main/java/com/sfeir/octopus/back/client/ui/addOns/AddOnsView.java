package com.sfeir.octopus.back.client.ui.addOns;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface AddOnsView extends IsWidget {

	void setPresenter(Presenter listener);

	public interface Presenter {

		void goTo(Place place);
	}
}
