package com.sfeir.octopus.back.client.ui.incomes;

import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.TextBox;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class IncomeViewImpl extends Composite implements IncomeView {

	private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

	interface ViewImplUiBinder extends UiBinder<Widget, IncomeViewImpl> {
	}

	private Presenter presenter;

    @UiField
    TextBox nameBox;

    @UiField
    Button saveButton;

	public IncomeViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

    @UiHandler("saveButton")
    public void saveClicked(ClickEvent event) {
        presenter.saveClicked();
    }

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
	}

}
