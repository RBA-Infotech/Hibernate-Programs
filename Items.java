package com.hibernat.HibernatPrgm;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {

	@Id
	@Column(name = "Item_No")
	private int itemNo;
	
	@Column(name = "Item_Name")
	private String itempName;
	
	@Column(name = "Item_Price")
	private float itemPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Cart_Id")
	private Cart cart;

	public Items(int itemNo, String itempName, float itemPrice, Cart cart) {
		this.itemNo = itemNo;
		this.itempName = itempName;
		this.itemPrice = itemPrice;
		this.cart = cart;
	}

	
	public Cart getCart() {
		return cart;
	}
}
