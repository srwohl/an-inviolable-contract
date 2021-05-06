package com.srwohl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srwohl.api.ENDPOINTS;
import com.srwohl.api.Transaction;
import com.srwohl.services.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	TransactionService service;
	
	@RequestMapping(value = ENDPOINTS.TRANSACTIONS.ID, method = RequestMethod.GET)
	public List<Transaction> getTransactionsForAccount(@PathVariable("id") Integer accountNumber){
		return service.findAllByAccountNumber(accountNumber);
	}
}
