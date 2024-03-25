
public class StaticMethods {

	public static void main(String[] args) {
		
		// Static methods are directly attached to class we don't need to instantiate them we can directly call methods on them
		
		Users u = new Users();
		u.setFirstName("Caleb");
		u.setLastName("Cury");
		
		Users.printUser(u);

	}

}
