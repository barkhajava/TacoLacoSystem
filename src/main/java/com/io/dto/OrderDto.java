package com.io.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDto {
    @JsonProperty("order")
	List<OrderItemDto> order;

	public List<OrderItemDto> getOrder() {
		return order;
	}

	public void setOrder(List<OrderItemDto> order) {
		this.order = order;
	}

}
