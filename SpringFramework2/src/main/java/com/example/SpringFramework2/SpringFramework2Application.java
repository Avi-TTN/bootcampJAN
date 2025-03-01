package com.example.SpringFramework2;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFramework2Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(SpringFramework2Application.class, args);
        //tightly coupled code example
//		Car car1 = new Mercedes();
//		car1.newCar();
//		Car car2 = new BMW();
//		car2.newCar();

		//loosely coupled code example
//		CarFactory carFactory = new CarFactory();
//		Car car1 = carFactory.getCar("Mercedes");
//		car1.newCar();
//		Car car2 = carFactory.getCar("BMW");
//		car2.newCar();

		CarFactory carFactory = context.getBean(CarFactory.class);
		Car car = carFactory.getCar();
		car.newCar();
	}

}
