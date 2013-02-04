package com.sfeir.octopus.back.client.ui.alerts;

import com.github.gwtbootstrap.client.ui.base.HasVisibility;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface AlertView extends IsWidget {

	void setPresenter(Presenter listener);

    void show();

	public interface Presenter {

		void goTo(Place place);
	}
}
