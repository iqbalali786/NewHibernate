package com.min.hiber.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
/*@DiscriminatorValue(value = "Bike")*/
public class TwoWhealer extends Vehicle {

	private String steearingHandle;

	public String getSteearingHandle() {
		return steearingHandle;
	}

	public void setSteearingHandle(String steearingHandle) {
		this.steearingHandle = steearingHandle;
	}
	
	
	
}
