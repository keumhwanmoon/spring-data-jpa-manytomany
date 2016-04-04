package com.example;

import com.example.member.entity.Member;
import com.example.member.repository.MemberRepository;
import com.example.order.entity.Order;
import com.example.order.repository.OrderRepository;
import com.example.product.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ManyToManyExample.class)
public class ManyToManyExampleTests {
	@Autowired
	MemberRepository memberRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductRepository productRepository;

	@Test
	public void contextLoads() {
	}

	@Test
    @Transactional
	public void fetchAllTest() throws Exception {
        List<Member> members = memberRepository.findAll();

        System.out.println("members.size() : " + members.size());

        List<Order> orders = members.get(0).getOrders();

        System.out.println("orders.size() : " + orders.size());
    }
}
