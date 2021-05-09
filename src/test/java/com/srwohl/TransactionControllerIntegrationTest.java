package com.srwohl;

import com.srwohl.api.ENDPOINTS;
import com.srwohl.services.TransactionService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class TransactionControllerIntegrationTest {
    
    @Autowired
    TransactionService service;
    
    @Autowired
    private MockMvc mvc;
 
    @Test
    void testGetAccountTransactions() throws Exception {
        mvc.perform(get(ENDPOINTS.TRANSACTIONS.BASE + "/123456"))
           .andExpect(status().isOk())
           .andExpect(content().contentType(MediaType.APPLICATION_JSON))
           .andExpect(jsonPath("$", hasSize(greaterThan(0))));
 
    }
}
