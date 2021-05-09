package com.srwohl.services;


import java.util.List;

import com.srwohl.api.Transaction;
import com.srwohl.repository.TransactionRepository;

import org.springframework.stereotype.Service;


@Service
public class TransactionServiceImpl implements TransactionService {
	
    public TransactionServiceImpl(TransactionRepository repository) {
		this.repository = repository;
	}

	
    private final TransactionRepository repository;
    
	@Override
	public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
		List<Transaction> transactions = repository.findAllByAccountNumber(accountNumber);
		return transactions;
	}


}
