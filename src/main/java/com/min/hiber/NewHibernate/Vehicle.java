package com.min.hiber.NewHibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Vehicle {

	private int vId;
	private String vName;
	private String vGear;
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getvGear() {
		return vGear;
	}
	public void setvGear(String vGear) {
		this.vGear = vGear;
	}
	public Vehicle(int vId, String vName, String vGear) {
		super();
		this.vId = vId;
		this.vName = vName;
		this.vGear = vGear;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vName=" + vName + ", vGear=" + vGear + "]";
	}
	
	
	
}
