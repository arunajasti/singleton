package com.aruna.spring.SpringBasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
	ITeacher tea = ctx .getBean("teacher",ITeacher.class);
	tea.teach();
				
	}

}
