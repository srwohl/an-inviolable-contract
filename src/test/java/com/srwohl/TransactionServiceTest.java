package com.srwohl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.srwohl.api.Transaction;
import com.srwohl.services.TransactionService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionServiceTest {
    
    @Autowired
    TransactionService service;
    
    @Test
	void testTransactionService() {
		List<Transaction> trans = service.findAllByAccountNumber(123456);
		// assertTrue(trans.stream().anyMatch(t -> {
		// 	return t.getAccountNumber().equals(123456);
		// }));
        assertTrue(!trans.isEmpty());
	}   
}
