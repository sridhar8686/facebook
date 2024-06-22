package com.InetBanking.pageobject;

import java.util.Iterator;
import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter String value");
		
		String str = sc.next();
		
		String rev ="";
		
//		int len= str.length();
//		
//		for(int i=len-1;i>=0;i--) 
//		{
//			rev = rev+str.charAt(i);
//			
//		}
//		System.out.println("reversed number is:"+rev);
		
//		using char array
		
//		char a[] = str.toCharArray();
//		int len = a.length;
//		
//		for (int i = len-1; i >=0; i--) 
//		
//		{
//			rev = rev+a[i];
//		}
//		System.out.println("reversed number is:"+rev);
		
//		using StringbUffer
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println("Reversed String is:" +sb.reverse());
	}

}
