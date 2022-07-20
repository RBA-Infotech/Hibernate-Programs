package com.hibernat.HibernatPrgm;

import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	@Column(name = "Cart_Id")
	private int cartId;

	@Column(name = "Cart_Name")
	private String cartName;

	@Column(name = "Total_Items")
	private int totalItems;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	private List<Items> items;

	public Cart(int cartId, String cartName) {
		this.cartId = cartId;
		this.cartName = cartName;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public int gettotalItems() {
		return totalItems;
	}

	public void settotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

}
