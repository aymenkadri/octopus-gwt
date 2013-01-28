package com.sfeir.octopus.back.client.ui.statistics;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface StatisticsView extends IsWidget {

	void setPresenter(Presenter listener);

	public interface Presenter {

		void goTo(Place place);
	}
}
