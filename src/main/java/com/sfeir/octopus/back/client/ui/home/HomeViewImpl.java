package com.sfeir.octopus.back.client.ui.home;

import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.Modal;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sfeir.octopus.back.client.ui.alerts.AlertViewImpl;

public class HomeViewImpl extends Composite implements HomeView {

	private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

	interface ViewImplUiBinder extends UiBinder<Widget, HomeViewImpl> {
	}

	private Presenter presenter;

    @UiField
    Button saveButton;

    @UiField
    AlertViewImpl dialogBox;

	public HomeViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

    @UiHandler("saveButton")
    public void saveClicked(ClickEvent event) {
        dialogBox.getModalMessages().show();
    }

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
	}

}
