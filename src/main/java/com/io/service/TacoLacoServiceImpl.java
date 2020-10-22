package com.io.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.io.dto.OrderItemDto;
import com.io.exception.ResourceNotFoundException;
import com.io.repository.TacoLacoRepository;

@Service
public class TacoLacoServiceImpl implements TacoLacoService {

	private final TacoLacoRepository repository;

	public TacoLacoServiceImpl(TacoLacoRepository repository) {
		this.repository = repository;
	}

	@Override
	public Double calculateOrderTotal(List<OrderItemDto> orderDto) {
		Map<String, Double> inventoryList = repository.getInventory();

		double total = 0.0;
		int qty = 0; // counter for 4 qty

		for (OrderItemDto i : orderDto) {
			qty = qty + i.getOrderQuantity();
			if (inventoryList.containsKey(i.getOrderItem())) {
				total = total + (i.getOrderQuantity() * inventoryList.get(i.getOrderItem()));
			} else {
				throw new ResourceNotFoundException();
			}
		}

		// if quantity more than 4 add discount
		if (qty > 4) {
			// adding a discount of 20 %
			total = total - ((total * 20) / 100);
		}
		return total;
	}

}
