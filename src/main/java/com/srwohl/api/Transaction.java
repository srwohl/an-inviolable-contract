package com.srwohl.api;

import lombok.Data;
import java.util.Date;

@Data
public class Transaction {
	
	private Type type;
	private Date date;
	private String accountNumber;
	private String curency;
	private Long amount;
	private String merchantName;
	private String merchantLogo;
	
	private enum Type {
		Transfer, Paymnet, Credit
	};

}
