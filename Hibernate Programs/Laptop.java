package com.hibernat.HibernatPrgm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	private int lapId;
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
