package com.srwohl.api;

import lombok.Builder;
import lombok.Data;
import java.util.Date;

@Data
@Builder
public class Transaction {
	
	private Type type;
	private Date date;
	private Integer accountNumber;
	private String currency;
	private Double amount;
	private String merchantName;
	private String merchantLogo;
	
	public enum Type {
		Transfer, Paymnet, Credit
	}
}
