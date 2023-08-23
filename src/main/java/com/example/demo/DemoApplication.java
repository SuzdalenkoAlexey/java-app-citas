package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

// Add the controller.
@RestController
class HelloWorldController {
  @GetMapping("/")
  public String hello() {
    return "git hub changed";
  }
  @GetMapping("/s")
  public String hellos() {
    return "git hub changed git hub changed git hub changed";
  }
}
