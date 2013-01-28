package com.sfeir.octopus.back.client.ui.newsletters;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class NewslettersViewImpl extends Composite implements NewslettersView {

	private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

	interface ViewImplUiBinder extends UiBinder<Widget, NewslettersViewImpl> {
	}

	private Presenter presenter;

	public NewslettersViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
	}

}
