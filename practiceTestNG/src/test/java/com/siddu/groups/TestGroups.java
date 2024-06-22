package com.siddu.groups;

import org.testng.annotations.Test;

@Test (groups = "all")

public class TestGroups {
	
	
	@Test (groups = {"Smoke","Windows.Smoke", "Ios.Smoke"})
	public void Builddeployment() {
		
		System.out.println("Deployment");
	}
	
	@Test(groups = {"Sanity","Windows.Smoke", "Ios.Smoke"})
   public void insall() {
	   
   
		
		System.out.println("Installed");
   }
   @Test(groups = {"Functional", "Regression","Sanity"})
   public void register() {
		
		System.out.println("Regisered");
	}
   
   @Test (groups = {"Functional", "Regression","Sanity","Windows.funtional"})
   public void login() {
		
		System.out.println("Logged in");
	}
   
   @Test (groups = {"Functional", "Regression", "Windows.regression"})
   
   public void BaanceInquiry() {
		
		System.out.println("Fetched the balance");
	}
   
   @Test (groups = {"Functional","Sanity"})
   public void Transaction() {
		
		System.out.println("Transferred");
	}
   
   @Test (groups = "Functional")
   public void HistoryUpdated() {
		
		System.out.println("Transaction updated");
	}
   
	
	

}
