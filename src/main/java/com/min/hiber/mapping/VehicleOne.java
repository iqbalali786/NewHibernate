package com.min.hiber.mapping;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class VehicleOne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehicleId;
	@Column(name = "vehicleName")
	private String vehicleName;
	@Column(name = "vehicleVender")
	private String vehicleVender;

}
