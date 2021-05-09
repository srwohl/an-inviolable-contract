package com.srwohl.controllers;

import java.util.List;

import com.srwohl.api.ENDPOINTS;
import com.srwohl.api.Transaction;
import com.srwohl.services.TransactionService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

	public TransactionController(final TransactionService service) {
        this.service = service;
    }
	
	@RequestMapping(value = ENDPOINTS.TRANSACTIONS.ID, method = RequestMethod.GET)
	public List<Transaction> getTransactionsForAccount(@PathVariable("id") Integer accountNumber){
		return service.findAllByAccountNumber(accountNumber);
	}

	private final TransactionService service;
}
