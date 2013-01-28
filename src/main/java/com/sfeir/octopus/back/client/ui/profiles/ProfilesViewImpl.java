package com.sfeir.octopus.back.client.ui.profiles;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ProfilesViewImpl extends Composite implements ProfilesView {

	private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

	interface ViewImplUiBinder extends UiBinder<Widget, ProfilesViewImpl> {
	}

	private Presenter presenter;

	public ProfilesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
	}

}
