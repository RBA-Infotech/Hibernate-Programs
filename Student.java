package com.hibernat.HibernatPrgm;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@Column(name="stud_id")
	private int studId;
	
	@Column(name="stud_name")
	private String studName;
	
	@Column(name="total_mark")
	private int totalMark;
	
	@Column(name="lap_id")
	private int lapId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="lap_id", insertable =  false, updatable = false)  //, referencedColumnName ="lap_id"
	private Laptop laptop;

	
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getLapId() {
		return lapId;
	}

	public void setLapId(int lapId) {
		this.lapId = lapId;
	}

}
