package com.io.dto;

public class OrderTotalResponseDto {
	Double orderTotal;

	public OrderTotalResponseDto(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

}
