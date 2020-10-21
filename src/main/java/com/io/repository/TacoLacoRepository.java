package com.io.repository;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public interface TacoLacoRepository {

	Map<String, Double> getInventory();
}
