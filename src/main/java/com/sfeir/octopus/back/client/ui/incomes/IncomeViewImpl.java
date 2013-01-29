package com.sfeir.octopus.back.client.ui.incomes;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class IncomeViewImpl extends Composite implements IncomeView {

	private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

	interface ViewImplUiBinder extends UiBinder<Widget, IncomeViewImpl> {
	}

	private Presenter presenter;

	public IncomeViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
	}

}
