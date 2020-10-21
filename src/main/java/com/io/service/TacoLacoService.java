package com.io.service;

import java.util.List;

import com.io.dto.OrderItemDto;

public interface TacoLacoService {

	Double calculateOrderTotal(List<OrderItemDto> orderDto);

}
