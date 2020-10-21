package com.io.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class TacoLacoRepositoryImpl implements TacoLacoRepository{

	public Map<String, Double> getInventory() {
		Map<String, Double> inventoryList = new HashMap<String, Double>();
		
		inventoryList.put("Veggie Taco",  2.50);
		inventoryList.put("Chicken Taco",  3.00);
		inventoryList.put("Beef Taco", 3.00);
		inventoryList.put("Chorizo Taco", 3.50);

		return inventoryList;
	}
}
