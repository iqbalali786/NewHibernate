package com.min.hiber.NewHibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int profId;
	private String profName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="proBooks", joinColumns=@JoinColumn(name="ProfId"),
	inverseJoinColumns=@JoinColumn(name="bookId")
			)
	private Collection<Books> books = new ArrayList<Books>();

	public int getProfId() {
		return profId;
	}

	public void setProfId(int profId) {
		this.profId = profId;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public Collection<Books> getBooks() {
		return books;
	}

	public void setBooks(Collection<Books> books) {
		this.books = books;
	}

	public Professor(String profName) {
		super();
		this.profName = profName;
	}

}
