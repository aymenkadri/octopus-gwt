package com.sfeir.octopus.back.client.ui.menu;

import com.github.gwtbootstrap.client.ui.NavLink;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sfeir.octopus.back.client.place.AddOnsPlace;
import com.sfeir.octopus.back.client.place.ArchivesPlace;
import com.sfeir.octopus.back.client.place.GroupsPlace;
import com.sfeir.octopus.back.client.place.ItemsPlace;
import com.sfeir.octopus.back.client.place.NewslettersPlace;
import com.sfeir.octopus.back.client.place.ProfilesPlace;
import com.sfeir.octopus.back.client.place.PublishPlace;
import com.sfeir.octopus.back.client.place.StatisticsPlace;
import com.sfeir.octopus.back.client.place.UsersPlace;

public class MenuViewImpl extends Composite implements MenuView {

	private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

	interface ViewImplUiBinder extends UiBinder<Widget, MenuViewImpl> {
	}
	
	@UiField
	NavLink publishingNav, itemsNav, addOnNav, statisticsNav, disconnectionNav;

	private Presenter presenter;

	public MenuViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
	}
	
	@UiHandler("publishingNav")
	public void clickOnPublishingNav(final ClickEvent event) {
		presenter.goToPublishPlace();
	}

	@UiHandler("itemsNav")
	public void clickOnItemsNavNav(final ClickEvent event) {
		presenter.goToItemsPlace();
	}

	@UiHandler("addOnNav")
	public void clickOnAddOnNav(final ClickEvent event) {
		presenter.goToAddOnsPlace();
	}
	
	@UiHandler("statisticsNav")
	public void clickOnStatisticsNav(final ClickEvent event) {
		presenter.goToStatisticsPlace();
	}
	
	@UiHandler("disconnectionNav")
	public void clickOnDisconnectionNav(final ClickEvent event) {
		presenter.disconnect();
	}

}
