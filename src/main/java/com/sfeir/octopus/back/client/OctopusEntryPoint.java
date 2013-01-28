package com.sfeir.octopus.back.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.sfeir.octopus.back.client.gin.OctopusGinjector;

public class OctopusEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {

		final OctopusGinjector ginjector = GWT.create(OctopusGinjector.class);

		final SimplePanel menuDisplay = ginjector.getWidget();
		ginjector.getContentManager().setDisplay(menuDisplay);

		final SimplePanel activityDisplay = ginjector.getWidget();
		ginjector.getActivityManager().setDisplay(activityDisplay);

		RootPanel.get("menu").add(menuDisplay);
		RootPanel.get("body").add(activityDisplay);

		ginjector.getPlaceHistoryHandler().handleCurrentHistory();
	}
}
