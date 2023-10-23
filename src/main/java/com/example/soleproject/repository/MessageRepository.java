package com.example.soleproject.repository;

import com.example.soleproject.entity.Message;
import com.example.soleproject.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
    List<Message> findAllBySendMember(Member member);

    List<Message> findAllByReceiverMember(Member member);


}