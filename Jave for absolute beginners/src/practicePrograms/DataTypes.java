package practicePrograms;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in); 
		System.out.println("what is your name?");
		String name = sc.nextLine();
		System.out.println("Hello "    +name);
		System.out.println("whast is your age?");
		int age = sc.nextInt();
		System.out.println("Your age is "    +age);
		System.out.println("Are you married? ");
		boolean N = sc.nextBoolean();
		System.out.println("Oh, Great! "+N); 
		sc.close();
		
		
				
		
		
		

	
		
	}
	
	
}
