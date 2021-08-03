package com.min.hiber.NewHibernate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Producer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int proId;
	private String productName;
	@Temporal(TemporalType.DATE)
	private Date prodExpireDate;
	@ManyToMany(cascade = CascadeType.ALL)
	private Collection<Consumer> consumers = new ArrayList<Consumer>();

	public Producer(String productName, Date prodExpireDate) {
		super();
		this.productName = productName;
		this.prodExpireDate = prodExpireDate;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getProdExpireDate() {
		return prodExpireDate;
	}

	public void setProdExpireDate(Date prodExpireDate) {
		this.prodExpireDate = prodExpireDate;
	}

	public Collection<Consumer> getConsumers() {
		return consumers;
	}

	public void setConsumers(Collection<Consumer> consumers) {
		this.consumers = consumers;
	}

	public Producer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
