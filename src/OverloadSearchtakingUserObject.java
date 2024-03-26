import java.util.ArrayList;
import java.util.List;

public class OverloadSearchtakingUserObject {

	public static void main(String[] args) {

		Users me = new Users();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		Users you = new Users();
		you.setFirstName("Anus");
		you.setLastName("Ali");
		
		List<Users> allUsers = new ArrayList<Users>(); 
		allUsers.add(me);
		allUsers.add(you);
		
		System.out.println(Users.searchList(allUsers,you));

	}

}
