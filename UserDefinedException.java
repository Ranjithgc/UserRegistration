package com.bridgelabz.junit;
// customized Exception
public class UserDefinedException extends Exception {
	
    public String errormessage;
    
    //Initializing Constructor
	public UserDefinedException(String message) {
		this.errormessage = message;	
	}
}