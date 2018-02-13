package com.daixu.spring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DW-Home on 18/1/28.
 */
@RestController
@RequestMapping("/try")
public class TryController {

  @RequestMapping("/throwException")
  public String tryException() throws Exception {
    throw new Exception("this is an exception throwed on purpose");

  }

}
