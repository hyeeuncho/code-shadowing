package com.crud.code_shadowing.repository;

import com.crud.code_shadowing.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}