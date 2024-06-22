package com.InetBanking.pageobject;

import java.util.Scanner;

public class reverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
//		Using algorithm
		
//		int rev= 0;
//		
//		while (num!=0) 
//		{
//			rev = rev*10+num%10;
//			num = num/10;
//			
//			
//		}
//		System.out.println("Reverse nunber is:" +rev);
		
//		Using StringBuffer
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		System.out.println("Reverse nunber is:" +rev);
		
//		using StringBuilder
		
		StringBuilder sbl = new StringBuilder(String.valueOf(num));
		StringBuilder rev = sbl.reverse();
		System.out.println("Reverse nunber is:" +rev);
	
		
		
		
		
		
		
		
	}

}
