package practice.Interfaces;

public class Toyota implements Car {

	boolean b, h;
	int g[] = { 0, 1, 2, 3, 4, 5 };

	int s;

	public void brake()
	
	{
		
		if(s==0) 
		
		{
			System.out.println("Brake is on");
			
		}
		else
			
			System.out.println("car is on running");
		
		
		
	}

	public void gear() 
	
	{
		for (int i=0;i<=g.length;i++) 
		
		
		{
			if (g[i]==5) {
				
				
				System.out.println("car is on top gear");
			}
			
			
			System.out.println("car is on control");
			
			
		}
		
		
		
		
		System.out.println("gear code");
		
	}

	public void speed() 
	
	{
		if(s==100) {
			
			System.out.println("Caution: control the speed");
		}
		

	}

	public void handbreak() 
	{
		
		
		if (s==0) {
			
			System.out.println("handbreak mode");
		}
		

	}

}
