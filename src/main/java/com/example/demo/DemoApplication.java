package com.example.demo;

import com.example.demo.utils.Calculator;
import com.example.demo.utils.CalculatorService;
import com.example.demo.utils.GestorFacturas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    /*
     * crear un objeto de forma normal
     */
    // CalculatorService calculator = new CalculatorService();
    
    /*
     * crear (pedir) mi ojeto ha Spring
     */
     CalculatorService calculatorService = (CalculatorService) context.getBean("calculatorService");
     GestorFacturas gestorFacturas = (GestorFacturas) context.getBean("gestroFacturas");
     gestorFacturas.calculatorService.miFunc();

     Calculator calculator = (Calculator) context.getBean("calculator");

		SpringApplication.run(DemoApplication.class, args);
	}

}




/*                                                                  
  https://javas-396717.uc.r.appspot.com 
  mysql data base id = mysqlcitas
            password = svoboda2019

  https://mvnrepository.com/ <- maven dependency (spring context, mysql connetor java)
  https://codelabs.developers.google.com/codelabs/cloud-app-engine-springboot#8

*/