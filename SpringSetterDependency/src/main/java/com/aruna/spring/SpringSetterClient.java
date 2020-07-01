package com.aruna.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aruna.spring.model.Address;
import com.aruna.spring.service.IVehicle;
import com.aruna.spring.service.impl.HondaImpl;

public class SpringSetterClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//IVehicle veh1 = ctx.getBean("vehicle",IVehicle.class);
		IVehicle veh1 = ctx.getBean("vehicle",IVehicle.class);
		veh1.print();
		
		/*IVehicle veh = new HondaImpl();
		System.out.println(veh.model());
		
	HondaImpl hon = new HondaImpl();
Address add = new Address();
add.setCity("Lincoln");
add.setState("NE");
add.setZip("68516");

hon.setAddress(add);
hon.print();*/

	}

}
