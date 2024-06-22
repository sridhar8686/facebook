package practiceOnObject;

import java.util.Arrays;
import java.util.Scanner;

public class EnterArrayValuesUsingScanner {

	public static void main(String[] args) {
		int a[]= new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<a.length;i++) 
		
		{
			
			System.out.println("Enter the value of the position"+i+":");
			a[i]=sc.nextInt();
			
			
			
		}
          System.out.println("Printing the Array.......");
          System.out.println(Arrays.toString(a));
	}

}
