package com.io.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderItemDto {
	@JsonProperty("OrderItem")
	private String OrderItem;

	@JsonProperty("orderQuantity")
	private int orderQuantity;

	public OrderItemDto(String orderItem, int orderQuantity) {
		OrderItem = orderItem;
		this.orderQuantity = orderQuantity;
	}

	public String getOrderItem() {
		return OrderItem;
	}

	public void setOrderItem(String orderItem) {
		OrderItem = orderItem;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

}
