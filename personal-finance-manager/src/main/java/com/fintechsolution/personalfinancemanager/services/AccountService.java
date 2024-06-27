package com.fintechsolution.personalfinancemanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintechsolution.personalfinancemanager.models.Account;
import com.fintechsolution.personalfinancemanager.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAll(){
		return accountRepository.findAll();
	}
	
	public Account getAccountById(Long id) {
		return accountRepository.findById(id).orElse(null);
	}
	
	public Account saveAccount(Account account) {
		return accountRepository.save(account);
	}
	
	public void deleteAccount(Long id) {
		accountRepository.deleteById(id);
	}
}
