package com.srwohl.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.srwohl.api.Transaction;


@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Override
	public List<Transaction> findAllByAccountNumber(String accountNumber) {
		List<Transaction> transactions = new ArrayList<Transaction>();
		return transactions;
	}


}
