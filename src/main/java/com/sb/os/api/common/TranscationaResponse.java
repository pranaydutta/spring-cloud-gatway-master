package com.sb.os.api.common;

import com.sb.os.api.model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TranscationaResponse {
	
	private Order order;
	private double amount;
	private String txId;
	private String message;
	

}
