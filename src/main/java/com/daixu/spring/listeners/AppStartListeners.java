package com.daixu.spring.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by DW-Home on 18/1/26.
 */
@Component
public class AppStartListeners implements ApplicationListener<ApplicationStartingEvent> {

  @Autowired
  private ApplicationArguments arguments;

  @Autowired
  private ApplicationContext applicationContext;

  @Override
  public void onApplicationEvent(ApplicationStartingEvent event) {
    System.out.println(applicationContext.getApplicationName() + " has args: " + arguments.getSourceArgs());
  }
}
