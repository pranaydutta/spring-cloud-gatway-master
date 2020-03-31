package com.sb.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.os.api.common.TranscationRequest;
import com.sb.os.api.common.TranscationaResponse;
import com.sb.os.api.model.Order;
import com.sb.os.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	
	
	@PostMapping("/bookOrder")
	public TranscationaResponse bookOrder(@RequestBody TranscationRequest transcationRequest)
	{
		return service.saveOrder(transcationRequest);
	}

}
