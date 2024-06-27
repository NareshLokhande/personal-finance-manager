package com.fintechsolution.personalfinancemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fintechsolution.personalfinancemanager.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
