package com.example.member.controller;

import com.example.member.entity.Member;
import com.example.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Moon, KeumHwan
 * @since 2016-04-04.
 */
@RestController
@RequestMapping(value = "members")
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Member> getMemberList() {
        return memberRepository.findAll();
    }
}
