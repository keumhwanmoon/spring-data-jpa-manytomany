package com.example.product.entity;

import com.example.order.entity.Order;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Moon, KeumHwan
 * @since 2016-04-04.
 */
@Entity
@Data
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "product")
    private List<Order> orders;
}
