package com.InetBanking.pageobject;

import java.util.Scanner;

public class Repeat {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		
		char[] a = str.toCharArray();
		int len = a.length;
		int count=0;
		for (int i = 0; i < len; i++) {
			
			for (int j = i+1; j < len; j++) {
				
				if (a[i]==a[j]) {
					
					System.out.println("duplicate charaacters are: "+a[j]);
					count++;
					
				}
				
				
			}
			
		}
		System.out.println("duplicate characters count: "+count);
		
	}

	
	
	


	}


