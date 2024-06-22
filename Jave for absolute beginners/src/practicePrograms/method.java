package practicePrograms;

public class method {

	public static void main(String[] args) {
		
	
		int result=add (9,4);
		System.out.println(result);
		
		

	}
	public static void sayHello() {
		
		System.out.println("Hello");
		
	}



//Example 2 with params

public static void greet(String name) {
	
	System.out.println("Hello " +name);
	
}

//Example 3 with params and return type

public static int add (int i,int j) {
	
	int k=i+j;
	return k;  
	
}
}

