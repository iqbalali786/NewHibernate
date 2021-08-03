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
import javax.persistence.ManyToOne;


@Entity
public class UserOne {
	
	
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

	@ManyToOne
	//@JoinTable(name="User_Details", joinColumns=@JoinColumn(name="UserId"), inverseJoinColumns=@JoinColumn(name="VehicleId"))
	private List<Vehicle> vehicles=new ArrayList<Vehicle>();

}
