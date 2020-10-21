package com.io.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class TacoLacoControllerTest {
	@Autowired
	private MockMvc mvc;

	@Before
	public void setup() {

	}

	@Test
	public void testGetOrderTotal() throws Exception {

		mvc.perform(MockMvcRequestBuilders.get("/getOrderTotal"))
		.andExpect(status().isOk())
		.andDo(print())
		.andExpect(content().contentType("application/json"))
		.andExpect(jsonPath("$[0].orderTotal").value(0));

	}

}
