package com.siddu.groups;

import org.testng.annotations.Test;

public class Testpayee {
	
	@Test (groups = {"Functional","Sanity", "Windows.funtional"})
	
public void addpayee() {
		
		System.out.println("Payee sucessfully added");
	}
	@Test (groups = {"Functional", "Windows.regression", "Ios.Smoke"})
public void Verifypayee() {
	
	System.out.println("Verified payee");
}
@Test (groups = "Functional")
public void TransferToPayee() {
	
	System.out.println("Sucessfully transferred to payee");
	
}
@Test (groups = "Functional")
	
public void Editpayee() {
	
	System.out.println("Sucesfully made the changes");
	
}
@Test (groups = "Functional")
public void DeletePayee() {
	
	System.out.println("Sucessfully Deleted the payee");
	
}






}