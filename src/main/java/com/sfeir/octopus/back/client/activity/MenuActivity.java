package com.sfeir.octopus.back.client.activity;



import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.sfeir.octopus.back.client.place.AddOnsPlace;
import com.sfeir.octopus.back.client.place.ArchivesPlace;
import com.sfeir.octopus.back.client.place.GroupsPlace;
import com.sfeir.octopus.back.client.place.ItemsPlace;
import com.sfeir.octopus.back.client.place.NewslettersPlace;
import com.sfeir.octopus.back.client.place.ProfilesPlace;
import com.sfeir.octopus.back.client.place.PublishPlace;
import com.sfeir.octopus.back.client.place.StatisticsPlace;
import com.sfeir.octopus.back.client.place.UsersPlace;
import com.sfeir.octopus.back.client.ui.menu.MenuView;

public class MenuActivity extends AbstractActivity implements MenuView.Presenter {

	@Inject
	private PlaceController placeController;

	@Inject
	private MenuView view;
	
	@Inject
	private PublishPlace publishPlace;
	
	@Inject
	private ArchivesPlace archivesPlace;
	
	@Inject
	private ItemsPlace itemsPlace;
	
	@Inject
	private ProfilesPlace profilesPlace;
	
	@Inject
	private UsersPlace usersPlace;
	
	@Inject
	private GroupsPlace groupsPlace;
	
	@Inject
	private NewslettersPlace newslettersPlace;
	
	@Inject
	private AddOnsPlace addOnsPlace;
	
	@Inject
	private StatisticsPlace statisticsPlace;

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
	}

	@Override
	public void goTo(final Place place) {
		placeController.goTo(place);
	}

	@Override
	public void goToPublishPlace() {
		goTo(publishPlace);
	}

	@Override
	public void goToArchivesPlace() {
		goTo(archivesPlace);
	}

	@Override
	public void goToItemsPlace() {
		goTo(itemsPlace);
	}

	@Override
	public void goToProfilesPlace() {
		goTo(profilesPlace);
	}

	@Override
	public void goToUsersPlace() {
		goTo(usersPlace);
	}

	@Override
	public void goToGroupsPlace() {
		goTo(groupsPlace);
	}

	@Override
	public void goToNewslettersPlace() {
		goTo(newslettersPlace);
	}

	@Override
	public void goToAddOnsPlace() {
		goTo(addOnsPlace);
	}

	@Override
	public void goToStatisticsPlace() {
		goTo(statisticsPlace);
	}

	@Override
	public void disconnect() {
		Window.alert("Disconnected");
	}

}
