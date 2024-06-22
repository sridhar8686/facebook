package practiceOnObject;

public class Admin extends Developer{
	
	public void manage() {
		
		System.out.println("Mange the code");
		
		
	}
	
	public static void main(String[] args) {
		 Guest guest = new Guest();
		 guest.read();
		 Developer Dev = new Developer();
		 Dev.Write();
		 Admin admin = new Admin();
		 admin.manage();
	}

}
