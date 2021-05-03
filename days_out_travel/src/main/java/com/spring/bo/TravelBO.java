 package com.spring.bo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.config.ApplicationConfig;
import com.spring.model.AdditionalChargeInfo;
import com.spring.model.Travel;

@Component
public class TravelBO {
			
	public double calculateTripCharge(Travel cObj,String hraType){
		int flag=0;
		double tripCharge=0.0;
		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdditionalChargeInfo additionalCharge=context.getBean(AdditionalChargeInfo.class);
		Map<String,Float> areaServiceCharge=new HashMap<>();
		areaServiceCharge=additionalCharge.getAreaServiceCharge();
		Set<String> s=new HashSet<String>(areaServiceCharge.keySet());
		for(String string:s){
			if(string.equalsIgnoreCase(hraType)){
				tripCharge=cObj.getDistanceTravelled()*cObj.getChargePerKm()+areaServiceCharge.get(string);
				flag=1;
				break;
			}
		}
		if(flag==0){
			tripCharge=cObj.getDistanceTravelled()*cObj.getChargePerKm();
		}
		return tripCharge;
	}
}
