package com.example.order.repository;

import com.example.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moon, KeumHwan
 * @since 2016-04-04.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
