package com.srwohl;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import com.srwohl.api.ENDPOINTS;
import com.srwohl.controllers.TransactionController;
import com.srwohl.services.TransactionService;
import com.srwohl.services.TransactionServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.LocalServerPort;


public class TransactionComponentTest {

    @LocalServerPort
    private int port;

    TransactionService service = new TransactionServiceImpl();

    @Test
	void testTransactionController() {
        given().
            standaloneSetup(new TransactionController(service)).
        when().
            get(ENDPOINTS.TRANSACTIONS.BASE + "/123456").
        then().
            statusCode(200);
	}   

}
