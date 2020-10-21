package com.io.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.io.dto.OrderDto;
import com.io.dto.OrderTotalResponseDto;
import com.io.service.TacoLacoService;


@RestController
public class TacoLacoController {
	
	@Autowired
	TacoLacoService service;
	
	@GetMapping(value = "/getOrderTotal")
	public OrderTotalResponseDto getOrderTotal( @RequestBody OrderDto order){
		double orderTotal =  service.calculateOrderTotal(order.getOrder());
		
		return new OrderTotalResponseDto(orderTotal);
	}

}
