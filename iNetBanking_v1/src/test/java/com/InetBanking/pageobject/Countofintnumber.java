package com.InetBanking.pageobject;

import java.util.Scanner;

public class Countofintnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int nunber = sc.nextInt();
		
		System.out.println(String.valueOf(Math.abs(nunber)).length());
		
	}

}
