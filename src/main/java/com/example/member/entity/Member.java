package com.example.member.entity;

import com.example.order.entity.Order;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Moon, KeumHwan
 * @since 2016-04-04.
 */
@Entity
@Data
@Table(name = "MEMBERS")
public class Member implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "member")
    private List<Order> orders;
}
