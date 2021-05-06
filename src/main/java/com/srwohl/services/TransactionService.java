package com.srwohl.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.srwohl.api.Transaction;

@Service
public interface TransactionService {
	public List<Transaction> findAllByAccountNumber(String accountNumber);
}
