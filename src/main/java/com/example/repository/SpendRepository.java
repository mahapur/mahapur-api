package com.example.repository;

import com.example.model.Spend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpendRepository extends JpaRepository<Spend,String> {
    @Query("SELECT w FROM spend w")
    List<Spend> findAllSpend(String userId);

    @Query("SELECT SUM(amount) AS amount FROM spend WHERE user_id = :userId")
    Double getTotalSpend(@Param("userId") String userId);
}
