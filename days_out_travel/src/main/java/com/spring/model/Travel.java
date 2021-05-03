package com.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Travel {
		
	private String tripId;
	private int distanceTravelled;
	private float chargePerKm;
	private AdditionalChargeInfo additionalCharge;
	public String getTripId() {
		return tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public int getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(int distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	public float getChargePerKm() {
		return chargePerKm;
	}
	public void setChargePerKm(float chargePerKm) {
		this.chargePerKm = chargePerKm;
	}
	public AdditionalChargeInfo getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(AdditionalChargeInfo additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	
}
