package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelBooking {

	@RequestMapping("/book")
	public String bookCab() {
		return "Your cab has been booked...thank you";
	}
}
