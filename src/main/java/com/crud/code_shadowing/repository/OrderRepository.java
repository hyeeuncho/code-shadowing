package com.crud.code_shadowing.repository;

import com.crud.code_shadowing.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}