package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		SpringApplication.run(DemoApplication.class, args);
	}

}

/*  
  https://javas-396717.uc.r.appspot.com 
  mysql data base id = mysqlcitas
            password = svoboda2019

  https://mvnrepository.com/ <- maven dependency (spring context, mysql connetor java)
*/

@RestController
class HelloWorldController {
  int i = 0;

  @GetMapping("/")
  public String hello() {
    System.out.println("Hello "+ ++i);
    return "index page new "+i;
  }
  @GetMapping("/s")
  public String hellos() {
    return "git hub changed git hub changed git hub changed";
  }
}


class CalculatorService {
    public static final String miFunc(){
      return "ok";
    }
}