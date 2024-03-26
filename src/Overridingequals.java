import java.util.ArrayList;
import java.util.List;

public class Overridingequals {

	public static void main(String[] args) {
		
		Users me = new Users();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		Users you = new Users();
		you.setFirstName("Caleb");
		you.setLastName("Curry");
		
		List<Users> allUsers = new ArrayList<Users>(); 
		allUsers.add(me);
		allUsers.add(you);
		
		System.out.println(me.equals(you));
		System.out.println(me.hashCode() == you.hashCode());

	}

}
