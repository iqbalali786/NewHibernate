package com.min.hiber.mapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userAge")
	private Integer userAge;
	@Column(name = "userCity")
	private String userCity;
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;

	@OneToMany
	@JoinTable(name="User_Details", joinColumns=@JoinColumn(name="UserId"), inverseJoinColumns=@JoinColumn(name="VehicleId"))
	private List<Vehicle> vehicles=new ArrayList<Vehicle>();

	public User(String userName, Integer userAge, String userCity, Date dateOfBirth) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userCity = userCity;
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userCity=" + userCity
				+ ", dateOfBirth=" + dateOfBirth + ", vehicles=" + vehicles + "]";
	}

	
	
	
	
}
