package com.min.hiber.NewHibernate;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="fucking_person")
public class NewPerson {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int personId;
	private String personName;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="new_vehicles",
	joinColumns=@JoinColumn(name="vehicle_Id"))
	private Collection<Vehicle> vehicles=new ArrayList<Vehicle>();
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public NewPerson(String personName) {
		super();
		this.personName = personName;
	}
	public NewPerson() {
		super();
	}
	
	
	
	
}
