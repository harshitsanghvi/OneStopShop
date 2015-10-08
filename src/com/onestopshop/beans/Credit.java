package com.onestopshop.beans;

import com.onestopshop.api.Authorization;

public class Credit implements Authorization {
	private Integer number;
	private Integer cvvNumber;
	private String cardName;
	private String type;
	private String expDate;
	
	
	public String getCardName() {
		return cardName;
	}
	public boolean setCardName(String cardName) {
		if(cardName.matches("^[a-zA-Z]*$") || cardName.matches("^[0-9]*$")){
        	this.cardName = cardName;
            return true;
        }
		return false;
	}

	public Integer getCvvNumber() {
		return cvvNumber;
	}
	public boolean setCvvNumber(String cvvNumber) {
		if(cvvNumber.length()==3 && cvvNumber.matches("^[0-9]*$")){
			this.cvvNumber = Integer.parseInt(cvvNumber);
			return true;
		}
		return false;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public boolean setNumber(String number) {
		if(number.length()==10){
			this.number = Integer.parseInt(number);
			return true;
		}
		return false;
	}
	
	public String getType() {
		return type;
	}
	public boolean setType(String type) {
		this.type = type;
		return true;
	}
	
	public String getExpDate() {
		return expDate;
	}
	public boolean setExpDate(String expDate) {
		if(expDate.matches("^[0-9]*$")){
			this.expDate = expDate;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean authorized() {
		// Check in Database
		if(number==1234567890 && cvvNumber==321 && cardName.equals("Sapient") && type.equals("MasterCard") && expDate.toString().equals("0815")){
			return true;
		}
		return false;
	}
	
}
