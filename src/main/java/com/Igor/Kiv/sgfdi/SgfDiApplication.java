package com.Igor.Kiv.sgfdi;

import com.Igor.Kiv.sgfdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SgfDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SgfDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

	}

}
