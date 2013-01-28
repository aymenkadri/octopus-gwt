package com.sfeir.octopus.back.client.ui.newsletters;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface NewslettersView extends IsWidget {

	void setPresenter(Presenter listener);

	public interface Presenter {

		void goTo(Place place);
	}
}
