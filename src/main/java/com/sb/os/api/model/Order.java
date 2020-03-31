package com.sb.os.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ORDER_TABLE")
public class Order {
	
	@Id
	private int id;
	private String name;
	private int qty;
	private double price;
	

}
