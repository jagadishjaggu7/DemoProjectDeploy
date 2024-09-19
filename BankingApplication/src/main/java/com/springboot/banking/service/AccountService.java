package com.springboot.banking.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.banking.dto.AccountDto;

@Service
public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(Integer Id);
	
	AccountDto deposit(Integer Id,double amount);
    
	AccountDto withdraw(Integer Id,double amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount(Integer Id);
}
