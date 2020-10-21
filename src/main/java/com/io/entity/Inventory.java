package com.io.entity;

import java.math.BigDecimal;

public class Inventory {

	private String item;

	private BigDecimal price;

	public Inventory(String item, BigDecimal price) {
		this.item = item;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
