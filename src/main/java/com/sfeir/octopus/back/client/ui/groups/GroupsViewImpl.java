package com.sfeir.octopus.back.client.ui.groups;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class GroupsViewImpl extends Composite implements GroupsView {

	private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

	interface ViewImplUiBinder extends UiBinder<Widget, GroupsViewImpl> {
	}

	private Presenter presenter;

	public GroupsViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(final Presenter listener) {
		presenter = listener;
	}

}
