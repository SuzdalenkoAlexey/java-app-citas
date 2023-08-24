package com.example.demo.controllers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import com.example.demo.utils.Calculator;

@RestController
public class IndexController {
      int i = 0;

  @GetMapping("/")
  public String hello() {
    System.out.println("Hello "+ ++i);

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Calculator calculator = (Calculator) context.getBean("calculator");
    return "index page new "+i+" "+calculator.holaMundo();
  }
  @GetMapping("/s")
  public String hellos() {
    return "git hub changed git hub changed git hub changed";
  }
}
