package com.example.member.repository;

import com.example.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moon, KeumHwan
 * @since 2016-04-04.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}
