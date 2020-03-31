package com.sb.os.api.service;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sb.os.api.common.Payment;
import com.sb.os.api.common.TranscationRequest;
import com.sb.os.api.common.TranscationaResponse;
import com.sb.os.api.dao.OrderRepository;
import com.sb.os.api.model.Order;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public TranscationaResponse saveOrder(TranscationRequest transcationRequest)
	{
		String response="";
		Order order=transcationRequest.getOrder();
		Payment payment=transcationRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		//rest call
		Payment paymentResponse=restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		response=paymentResponse.getPaymentStatus().equals("success")?"Payment processing sucessfull  and Order Placed":"payment failed";
		
		repository.save(order);
		return new TranscationaResponse(order,paymentResponse.getAmount() , paymentResponse.getTranscationId(), response);
	}

}
