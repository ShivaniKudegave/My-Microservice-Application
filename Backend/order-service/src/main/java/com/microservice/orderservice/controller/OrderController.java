package com.microservice.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.orderservice.feign.PaymentClient;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private final PaymentClient paymentClient;
	
	public OrderController(PaymentClient paymentClient) {
		this.paymentClient = paymentClient;
	}
	
	@GetMapping("/pay")
	 public String createOrderAndPay() {
        String paymentResponse = paymentClient.getPaymentStatus();
        return "Order placed | " + paymentResponse;
    }
	@GetMapping("/test")
	public String test() {
	    return "Order Service is working";
	}
}
