import java.util.ArrayList;
import java.util.List;

public class StaticMethodsinList {

	public static void main(String[] args) {
		
		Users me = new Users();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		Users you = new Users();
		you.setFirstName("Charles");
		
		List<Users> allUsers = new ArrayList<Users>(); 
		allUsers.add(me);
		allUsers.add(you);
		
		Users.printUsers(allUsers);

	}

}
