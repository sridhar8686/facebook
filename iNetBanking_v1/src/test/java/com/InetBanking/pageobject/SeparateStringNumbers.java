package com.InetBanking.pageobject;

import java.util.Scanner;

public class SeparateStringNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String letters="";
		String numbers="";
		
		char[] arr=str.toCharArray();
		
		for (char c: arr) {
			
			if (Character.isDigit(c) ) {
				numbers+=c;
			}else if(Character.isLetter(c)) {
				letters+=c;
			}
			
		}
		
System.out.println("letters "+letters);
System.out.println("numbers "+numbers);
	}

}
