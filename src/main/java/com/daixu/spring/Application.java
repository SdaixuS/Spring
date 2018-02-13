package com.daixu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by DW-Home on 18/1/26.
 */

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Application.class);
    app.run(args);

  }
}
