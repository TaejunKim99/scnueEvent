package com.example.soleproject.controller;

import com.example.soleproject.entity.ClubScnu;
import com.example.soleproject.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainApiController {

    @Autowired
    private ClubRepository clubRepository;

    @GetMapping("/api/main/")
    public List<ClubScnu> main(){

        return clubRepository.findAll();

    }

    @GetMapping("/api/main/club")
    public List<ClubScnu> clubMain() {
        return clubRepository.findByCategory("club");
    }

    @GetMapping("/api/main/extracurricular")
    public List<ClubScnu> extracurricularMain() {
        return clubRepository.findByCategory("extracurricular");
    }

    @GetMapping("/api/main/school")
    public List<ClubScnu> schoolMain() {
        return clubRepository.findByCategory("school");
    }

    @GetMapping("/api/main/student")
    public List<ClubScnu> studentMain() {
        return clubRepository.findByCategory("student");
    }

    @GetMapping("/api/main/scholarship")
    public List<ClubScnu> scholarshipMain() {
        return clubRepository.findByCategory("scholarship");
    }
}
