package com.example.repository;

import com.example.model.HelpInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelpInfoRepository extends JpaRepository<HelpInfo,Integer> {
    List<HelpInfo> findAllByCity(String city);
}