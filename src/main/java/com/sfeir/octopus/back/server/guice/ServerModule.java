package com.sfeir.octopus.back.server.guice;

import com.google.inject.AbstractModule;

/**
 * Main Server Guice Module
 */
public class ServerModule extends AbstractModule {
  
  @Override
  protected void configure() {
    install(new ServletPathModule());
    install(new ServletsModule());
  }
  
}
