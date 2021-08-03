package com.min.hiber.NewHibernate;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private String pName;
	private String gender;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="vId", column = @Column(name="VHomeId")),
		@AttributeOverride(name="vName", column=@Column(name="VHomeName")),
		@AttributeOverride(name="vGear",column=@Column(name="VHomeGear"))
	})
	private Vehicle vehicleHome;
	@Embedded
	private Vehicle vehicle;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}
	
	

	public Vehicle getVehicleHome() {
		return vehicleHome;
	}

	public void setVehicleHome(Vehicle vehicleHome) {
		this.vehicleHome = vehicleHome;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", gender=" + gender + ", date=" + date + ", vehicle="
				+ vehicle + "]";
	}

	public Person(String pName, String gender, Date date) {
		super();
		this.pName = pName;
		this.gender = gender;
		this.date = date;
		this.vehicle = vehicle;
	}
	

}
