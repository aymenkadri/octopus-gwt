package com.sfeir.octopus.back.client.gin;


import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.SimplePanel;
import com.sfeir.octopus.back.client.mvp.ContentManager;

@GinModules(OctopusModule.class)
public interface OctopusGinjector extends Ginjector {

	ActivityManager getActivityManager();

	SimplePanel getWidget();

	PlaceHistoryHandler getPlaceHistoryHandler();

	ContentManager getContentManager();

}
