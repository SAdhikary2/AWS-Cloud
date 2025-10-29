package com.sukalyan.rds.repository;
import com.sukalyan.rds.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}