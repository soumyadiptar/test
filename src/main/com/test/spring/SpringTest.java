package com.test.spring;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String args[]) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
		Triangle triangle = (Triangle)context.getBean("triangle-related");
		context.registerShutdownHook();
		triangle.draw();
		triangle.drawList();
		
		
	}
}
