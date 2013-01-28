package com.sfeir.octopus.back.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface InitializationServiceAsync {

	public void initTest(AsyncCallback<Void> callback);
	public void initParagraphes(AsyncCallback<Void> callback);
}
