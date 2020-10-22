package com.io.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.io.dto.OrderItemDto;

@Service
public interface TacoLacoService {

	Double calculateOrderTotal(List<OrderItemDto> orderDto);

}
