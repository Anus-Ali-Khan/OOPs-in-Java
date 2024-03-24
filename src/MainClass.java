
public class MainClass {

	public static void main(String[] args) {
		
		// Saving values in fields of class
		Users user = new Users(); // this is the object of Users class
		user.setFirstName("Anus"); 
		// user.lastName = "Ali";
		user.setLastName("Ali");
		// System.out.println(user.firstName + " " + user.lastName);
		
		
		//calling method with arguments
		  user.output(3);
		  
		  
		// return keyword statement use
		  String message = user.returnOutput(); 
		  System.out.println(message);
		  
		 // printing firstname
		  System.out.println(user.getFirstName() + " " + user.getLastName());
		  
		
		

	}

}
