package com.InetBanking.pageobject;

import java.util.Scanner;

public class Strlength {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int i=0;
		
		for (char a:str.toCharArray()) {
			
			i++;
			
		}
		
System.out.println("The lenght of "+str+" is"+" "+i);
	}

}
