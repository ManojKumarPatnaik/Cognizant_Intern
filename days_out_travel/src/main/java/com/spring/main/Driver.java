package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.spring.exception.InvalidDistanceTravelledException;
import com.spring.service.TravelService;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tripCharge=0.0;
		
		ApplicationContext context=new AnnotationConfigApplicationContext(com.spring.config.ApplicationConfig.class);
		
		TravelService travelservice=context.getBean(TravelService.class);
		
		System.out.println("Enter the trip ID:");
		String id=sc.nextLine();
		
		System.out.println("Enter the total distance travelled:");
		int dist=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the type of HRA classification:");
		String type=sc.nextLine();
		
		try{
			tripCharge=travelservice.calculateTripCharge(id,dist,type);
			System.out.println("Total trip Charge:"+tripCharge);
		}
		catch(InvalidDistanceTravelledException e){
			System.out.println(e.getMessage());
		}

	}

}
