package com.hibernat.HibernatPrgm;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int studId;
	private String studName;
	private int totalMark;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name="Student_Laptop", joinColumns = @JoinColumn(name = "studId"), inverseJoinColumns = @JoinColumn(name = "lapId"))
	private Laptop laptop;

	@Id
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

}
