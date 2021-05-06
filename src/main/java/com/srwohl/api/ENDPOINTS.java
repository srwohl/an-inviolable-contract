package com.srwohl.api;

public interface ENDPOINTS {
	public static final String API_BASE = "/api/v2";
	
	public static interface TRANSACTIONS {
		public static final String BASE = API_BASE + "/transactions";
		public static final String ID = BASE + "/{id}";
	}

}
