package com.sfeir.octopus.back.server.guice;


import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.sfeir.octopus.back.server.rpc.IncomeServiceImpl;
import com.sfeir.octopus.back.server.rpc.InitializationServiceImpl;

/**
 * bind servlets in singleton here
 */
public class ServletsModule extends AbstractModule {
  
  @Override
  protected void configure() {
    bind(InitializationServiceImpl.class).in(Singleton.class);
    bind(IncomeServiceImpl.class).in(Singleton.class);
  }
  
}
