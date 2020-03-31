package com.sb.os.api.common;


import com.sb.os.api.model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TranscationRequest {
	
	private Order order;
	private Payment payment;

}
