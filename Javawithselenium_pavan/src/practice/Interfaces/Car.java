package practice.Interfaces;

public interface Car {
	
	
	public void brake();
	public void gear();
	public void speed();
	public void handbreak();
	default void rooftop() {
		System.out.println("Car rooftop code");
		
	}
	
	static void security() {
		
		System.out.println("car security code");
	}
	
	
	
	

}
