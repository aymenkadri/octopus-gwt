package com.sfeir.octopus.back.client.ui.publishing;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class PublishViewImpl extends Composite implements PublishView {

	private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

	interface ViewImplUiBinder extends UiBinder<Widget, PublishViewImpl> {
	}

	private Presenter presenter;

	public PublishViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
	}

}
