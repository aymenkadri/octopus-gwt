package com.sfeir.octopus.back.server.guice;

import com.google.inject.servlet.ServletModule;
import com.sfeir.octopus.back.server.rpc.IncomeServiceImpl;
import com.sfeir.octopus.back.server.rpc.InitializationServiceImpl;

/**
 * This starts in web.xml. All requests are intercepted and sent here.
 */
public class ServletPathModule extends ServletModule {
  
  @Override
  public void configureServlets() {
    // GWT RPC request path
    serve("/Octopus/incomeService*").with(IncomeServiceImpl.class);
    serve("/Octopus/initializationService*").with(InitializationServiceImpl.class);
    
    // ignore _ah which is google built in servlets base path
    //serveRegex("^/(?!_ah.*)").with(HomeServlet.class);
  }
  
}
