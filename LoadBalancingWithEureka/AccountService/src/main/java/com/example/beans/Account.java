package com.example.beans;

public class Account {
	
	private String customerName;
	private Boolean accountActive;
	private Double accountBalance;
	private String port;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Boolean getAccountActive() {
		return accountActive;
	}
	public void setAccountActive(Boolean accountActive) {
		this.accountActive = accountActive;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}

}
