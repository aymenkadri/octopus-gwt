package com.sfeir.octopus.back.client.ui.alerts;

import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.Modal;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AlertViewImpl extends Composite implements AlertView {

    private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

    interface ViewImplUiBinder extends UiBinder<Widget, AlertViewImpl> {
    }

    private Presenter presenter;

    @UiField
    Modal modalMessages;

    public AlertViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public void show() {
        Window.alert("AlertViewImpl");
        //getModalMessages().show();
    }

    @Override
    public void setPresenter(final Presenter listener) {
        presenter = listener;
    }

    public Modal getModalMessages() {
        return modalMessages;
    }
}
