import java.util.ArrayList;
import java.util.List;

public class passingByvalueorRefrence {

	public static void main(String[] args) {
		

		Users me = new Users();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		Users you = new Users();
		you.setFirstName("Not");
		you.setLastName("Me");
		
		List<Users> allUsers = new ArrayList<Users>(); 
		allUsers.add(me);
		allUsers.add(you);
		
		
		
		Users.changeCrap(you);
		System.out.println(you);
		

	}

}
