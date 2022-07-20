package com.hibernat.HibernatPrgm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="laptop")
public class Laptop {

	@Id
	@Column(name="lap_id")
	private int lapId;
	
	@Column(name="lap_name")
	private String lapName;

	public int getLapId() {
		return lapId;
	}

	public void setLapId(int lapId) {
		this.lapId = lapId;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

}
