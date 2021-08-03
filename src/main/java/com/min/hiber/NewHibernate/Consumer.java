package com.min.hiber.NewHibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int conId;
	private String conName;
	private String conGender;
	@ManyToMany(cascade = CascadeType.ALL)
	private Collection<Producer> producers = new ArrayList<Producer>();

	public Consumer(String conName, String conGender) {
		super();
		this.conName = conName;
		this.conGender = conGender;
	}

	public int getConId() {
		return conId;
	}

	public void setConId(int conId) {
		this.conId = conId;
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public String getConGender() {
		return conGender;
	}

	public void setConGender(String conGender) {
		this.conGender = conGender;
	}

	public Collection<Producer> getProducers() {
		return producers;
	}

	public void setProducers(Collection<Producer> producers) {
		this.producers = producers;
	}

	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
