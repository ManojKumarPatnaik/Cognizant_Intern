package com.demo.spring.springcoreadv.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Mytest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext("com/demo/spring/springcoreadv/autowiring/constructor.xml");
		Employee obj=(Employee)ctx.getBean("employee");
		System.out.println(obj.toString());

	}

}
