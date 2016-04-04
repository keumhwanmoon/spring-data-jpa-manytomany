package com.example.order.controller;

import com.example.member.entity.Member;
import com.example.member.repository.MemberRepository;
import com.example.order.dto.OrderDTO;
import com.example.order.entity.Order;
import com.example.order.repository.OrderRepository;
import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Moon, KeumHwan
 * @since 2016-04-04.
 */
@RestController
@RequestMapping(value = "orders")
public class OrderController {
    @Autowired
    MemberRepository memberRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderRepository orderRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Order registOrder(@RequestBody OrderDTO orderDTO) {
        Member member = memberRepository.findOne(orderDTO.getMemberId());
        Product product = productRepository.findOne(orderDTO.getProductId());

        final Order order = new Order();

        order.setMember(member);
        order.setProduct(product);
        order.setOrderDate(new Date());

        return orderRepository.save(order);
    }
}
