package com.min.hiber.criteriatest;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Actors {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int actorId;
	
	private String actorName;
	
	private String actorFilm;
	
	@Temporal(TemporalType.DATE)
	private Date actorDOB;

	public Actors(String actorName, String actorFilm, Date actorDOB) {
		super();
		this.actorName = actorName;
		this.actorFilm = actorFilm;
		this.actorDOB = actorDOB;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActorFilm() {
		return actorFilm;
	}

	public void setActorFilm(String actorFilm) {
		this.actorFilm = actorFilm;
	}

	public Date getActorDOB() {
		return actorDOB;
	}

	public void setActorDOB(Date actorDOB) {
		this.actorDOB = actorDOB;
	}

	public Actors() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
