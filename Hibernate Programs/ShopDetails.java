package com.hibernat.HibernatPrgm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShopDetails {

	@Id
	private int productID;
	private String productName;
	private float productPrice;

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

}
