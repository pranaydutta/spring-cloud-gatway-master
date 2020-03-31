package com.sb.os.api.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	
	private int paymentId;
	private String paymentStatus;
	private String transcationId;
	private int orderId;
	private double amount;
	

}
