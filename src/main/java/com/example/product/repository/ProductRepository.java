package com.example.product.repository;

import com.example.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moon, KeumHwan
 * @since 2016-04-04.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
