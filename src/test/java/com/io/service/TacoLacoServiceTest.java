package com.io.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.io.dto.OrderItemDto;
import com.io.exception.ResourceNotFoundException;
import com.io.repository.TacoLacoRepository;
import com.io.repository.TacoLacoRepositoryImpl;

@RunWith(SpringRunner.class)
public class TacoLacoServiceTest {

	private TacoLacoServiceImpl tacolocoservice;

	private TacoLacoRepository repository = new TacoLacoRepositoryImpl();

	@Before
	public void setup() {
		tacolocoservice = new TacoLacoServiceImpl(repository);
	}

	@Test
	public void testCalculateOrderTotal() throws Exception {
		Double total = tacolocoservice.calculateOrderTotal(getOrderDto());
		assertEquals(5.00, total);
	}

	@Test(expected = ResourceNotFoundException.class)
	public void testCalculateOrderTotalWithException() throws Exception {
		tacolocoservice.calculateOrderTotal(getExceptionOrderDto());
	}

	private List<OrderItemDto> getOrderDto() {
		List<OrderItemDto> orderItemList = new ArrayList<OrderItemDto>();
		orderItemList.add(new OrderItemDto("Veggie Taco", 2));

		return orderItemList;
	}

	private List<OrderItemDto> getExceptionOrderDto() {
		List<OrderItemDto> orderItemList = new ArrayList<OrderItemDto>();
		orderItemList.add(new OrderItemDto("Veggie Tacos", 2));

		return orderItemList;
	}
}