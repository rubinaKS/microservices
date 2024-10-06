package com.supplier.localsupplier.repository;

import com.supplier.localsupplier.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
