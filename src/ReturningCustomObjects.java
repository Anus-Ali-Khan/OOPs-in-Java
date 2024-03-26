import java.util.ArrayList;
import java.util.List;

public class ReturningCustomObjects {

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
		
		Users search = new Users();
		search.setFirstName("Not");
		search.setLastName("Me");
		
		Users found = Users.findUser(allUsers, search);
		
		//Since its printing the same object not copying it so if we change it the object will also changed
		found.setFirstName("Sally");
		
		System.out.println(found);
		
	}

}
