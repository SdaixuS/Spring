package com.daixu.spring.service.impl;

import com.daixu.spring.service.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created by DW-Home on 18/1/26.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayHelloToWho(String who) {
    return "Hello, " + who + " !";
  }
}
