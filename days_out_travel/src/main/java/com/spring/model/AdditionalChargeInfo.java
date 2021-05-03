package com.spring.model;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AdditionalChargeInfo {
		
	@Value("#{${areaServiceCharge:{Rural:'100.0',Urban:'300.0',Metropolitan:'500.0'}}}")
	private Map<String,Float> areaServiceCharge;

	public Map<String, Float> getAreaServiceCharge() {
		return areaServiceCharge;
	}

	public void setAreaServiceCharge(Map<String, Float> areaServiceCharge) {
		this.areaServiceCharge = areaServiceCharge;
	}
	
	
}
