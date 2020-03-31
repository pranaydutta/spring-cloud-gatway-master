package com.sb.os.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.os.api.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
