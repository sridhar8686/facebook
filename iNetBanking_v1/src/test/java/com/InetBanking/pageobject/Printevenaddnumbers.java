package com.InetBanking.pageobject;

public class Printevenaddnumbers {

	public static void main(String[] args) {
		int [] arr= {12,21,34,567,789,890};
		
		for (int i : arr) {
			
			if(i%2==0) {
				
				System.out.println("Even numbers" +i);
				
				
			}
			if(i%2!=0) {
				System.out.println("odd numbers" +i);
				
			}
			
		}

	}

}
