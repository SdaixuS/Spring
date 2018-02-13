package com.daixu.spring.web;

import com.daixu.spring.response.MyResponse;
import com.daixu.spring.response.MyResponseBuilder;
import com.daixu.spring.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DW-Home on 18/1/26.
 */
@RestController
@RequestMapping("/reception")
public class ReceptionController {

  @Autowired
  private GreetingService greetingService;

  @RequestMapping(value = "/greeting/{who}", method = RequestMethod.GET)
  public MyResponse greetingToCustom(@PathVariable("who") String who) {
    return MyResponseBuilder.buildOKResponse(greetingService.sayHelloToWho(who));
  }
}
