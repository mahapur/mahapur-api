package com.example.repository;

import com.example.model.Spend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpendRepository extends JpaRepository<Spend,String> {
    @Override
    <S extends Spend> S save(S entity);

    @Override
    Optional<Spend> findById(String userId);

    @Query("SELECT w FROM spend w")
    List<Spend> findAllSpend(String userId);
}
