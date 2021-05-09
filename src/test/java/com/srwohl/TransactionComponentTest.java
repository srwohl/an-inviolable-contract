package com.srwohl;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import com.srwohl.api.ENDPOINTS;
import com.srwohl.controllers.TransactionController;
import com.srwohl.repository.TransactionRepository;
import com.srwohl.services.TransactionServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class TransactionComponentTest {

    @Mock
    TransactionRepository repository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
	void testTransactionController() {
        given().
            standaloneSetup(new TransactionController(new TransactionServiceImpl(repository))).
        when().
            get(ENDPOINTS.TRANSACTIONS.BASE + "/123456").
        then().
            statusCode(200);
	}   

}
