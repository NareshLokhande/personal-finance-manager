package com.fintechsolution.personalfinancemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fintechsolution.personalfinancemanager.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
