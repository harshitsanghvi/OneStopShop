package com.onestopshop.beans;

import com.onestopshop.api.Authorization;

public class Check implements Authorization{
	private String name;
	private String bankID;
	
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
        if(name.matches("^[a-zA-Z]*$")){
        	this.name = name;
            return true;
        }
		return false;
	}
	
	public String getBankID() {
		return bankID;
	}
	public boolean setBankID(String bankID) {
		this.bankID = bankID;
		return true;
	}
	
	@Override
	public boolean authorized() {
		// Check in Database
		if(this.name.equals("Sapient") && this.bankID.equals("1234"))
			return true;
		return false;
	}
	
}
