package com.sfeir.octopus.back.client.ui.menu;

import com.github.gwtbootstrap.client.ui.NavLink;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MenuViewImpl extends Composite implements MenuView {

	private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

	interface ViewImplUiBinder extends UiBinder<Widget, MenuViewImpl> {
	}
	
	@UiField
	NavLink itemsNav, addOnNav, statisticsNav, disconnectionNav, mapNav;

	private Presenter presenter;

	public MenuViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
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

    @UiHandler("mapNav")
    public void clickOnMapNav(final ClickEvent event) {
        presenter.goToMapPlace();
    }
	
	@UiHandler("disconnectionNav")
	public void clickOnDisconnectionNav(final ClickEvent event) {
		presenter.disconnect();
	}

}
