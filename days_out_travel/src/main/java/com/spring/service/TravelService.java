package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.bo.TravelBO;

import com.spring.exception.InvalidDistanceTravelledException;
import com.spring.model.Travel;

@Component
public class TravelService {
		
	private TravelBO travelBoObj;

	
	@Autowired
	public void setTravelBoObj(TravelBO travelBoObj) {
		this.travelBoObj = travelBoObj;
	}
	
	public double calculateTripCharge(String tripId,int distanceTravelled,String hraType) throws InvalidDistanceTravelledException{
		
		double tripCharge=0.0;
		ApplicationContext context=new AnnotationConfigApplicationContext(com.spring.config.ApplicationConfig.class);
		
		Travel travel=context.getBean(Travel.class);
		
		if(distanceTravelled>0 && distanceTravelled<400){
			travel.setDistanceTravelled(distanceTravelled);
			travel.setTripId(tripId);
			tripCharge=travelBoObj.calculateTripCharge(travel, hraType);
		}
		else{
			throw new InvalidDistanceTravelledException("Distance Travelled is not Valid");
		}
		return tripCharge;
	}
}
