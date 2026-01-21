package com.microservice.payment_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@GetMapping("/status")
	public String PaymentStatus() {
		return "Payment successful";
	}
}
