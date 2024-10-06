package com.supplier.internationalsupplier.repository;

import com.supplier.internationalsupplier.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
