package com.example.soleproject.repository;

import com.example.soleproject.entity.ClubScnu;
import com.example.soleproject.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ClubRepository extends JpaRepository<ClubScnu,Long> {
    @Override
    ArrayList<ClubScnu> findAll();

    ArrayList<ClubScnu> findByTitleContainingAndCategory(String title,String category);

    ArrayList<ClubScnu> findByCategory(String category);

    ArrayList<ClubScnu> findByTitleContaining(String title);

    ArrayList<ClubScnu> findByMemberId(Long id);
}
