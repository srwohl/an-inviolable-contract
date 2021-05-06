package com.srwohl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.srwohl.api.Transaction;
import com.srwohl.services.TransactionService;
import com.srwohl.services.TransactionServiceImpl;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testTransactionService() {
		TransactionService service = new TransactionServiceImpl();
		List<Transaction> trans = service.findAllByAccountNumber("iwishthiswasauuid");
		assertTrue(trans.isEmpty());
	}
}
