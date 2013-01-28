package com.sfeir.octopus.back.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("initializationService")
public interface InitializationService extends RemoteService {
	
	public void initTest();

	public void initParagraphes();
}
