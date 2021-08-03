package com.min.hiber.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehicleId;
	@Column(name = "vehicleName")
	private String vehicleName;
	@Column(name = "vehicleVender")
	private String vehicleVender;

	public Vehicle(String vehicleName, String vehicleVender) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleVender = vehicleVender;
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleVender() {
		return vehicleVender;
	}

	public void setVehicleVender(String vehicleVender) {
		this.vehicleVender = vehicleVender;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleVender=" + vehicleVender
				+ "]";
	}

}
