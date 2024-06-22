package practicePrograms;

public class Bike {
	
	int noOfGears=4;
	String Color="black";
	
	
	public void IncreaseAccelaration(int speed) {
		
		System.out.println( "accesslaration is increased by " +speed );
		
	}
	
	public String getColor() {
		
		return Color;
		
		
		
	}
	
	public void setColor(String Color) {
		
		this.Color= Color;
		
	}
	

}
