package com.example.demo.repo;

import com.example.demo.doa.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Transaction, Integer> {
}
