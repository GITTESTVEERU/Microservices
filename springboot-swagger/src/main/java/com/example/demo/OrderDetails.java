package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rest/order")
public class OrderDetails {

	@GetMapping
	@ApiOperation(value="Getting Orders")
	public List<Order> getOrders() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("Mobile", 25000));
		return orders;

	}

	private class Order {
		String orderName;
		Integer orderPrice;

		Order(String orderName, Integer orderPrice) {

		}

		public String getOrderName() {
			return orderName;
		}

		public void setOrderName(String orderName) {
			this.orderName = orderName;
		}

		public Integer getOrderPrice() {
			return orderPrice;
		}

		public void setOrderPrice(Integer orderPrice) {
			this.orderPrice = orderPrice;
		}
	}

}
