package com.srwohl.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.srwohl.api.Transaction;


@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Override
	public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
		List<Transaction> transactions = new ArrayList<Transaction>();
        System.out.println(accountNumber);
        // Transaction tran = Transaction
        // 	.builder()
        // 	.type(Transaction.Type.Credit)
        // 	.date(new Date())
        // 	.accountNumber(accountNumber)
        // 	.currency("USD")
        // 	.amount(100.00)
        // 	.merchantName("acme")
        // 	.merchantLogo("images/acme-logo.png")
        // 	.build();
        
		// transactions.add(tran);
		return transactions;
	}


}
