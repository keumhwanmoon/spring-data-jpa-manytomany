package com.example.order.entity;

import com.example.member.entity.Member;
import com.example.product.entity.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Moon, KeumHwan
 * @since 2016-04-04.
 */
@Entity
@Data
@Table(name = "ORDERS")
@ToString(exclude = {"member", "product"})
public class Order implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    @JsonIgnore
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    @JsonIgnore
    private Product product;

    private Date date;
}
