package com.example.repository;

import com.example.model.Spend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpendRepository extends JpaRepository<Spend,String> {
    @Override
    <S extends Spend> S save(S entity);

    @Query("SELECT w FROM spend w")
    List<Spend> findAllSpend(String userId);
}
