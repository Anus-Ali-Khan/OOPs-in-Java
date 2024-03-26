import java.util.ArrayList;
import java.util.List;

public class SearchListforCustomObjects {

	public static void main(String[] args) {
		
		Users me = new Users();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		Users you = new Users();
		you.setFirstName("Charles");
		you.setLastName("n");
		
		List<Users> allUsers = new ArrayList<Users>(); 
		allUsers.add(me);
		allUsers.add(you);
		
		System.out.println(Users.searchList(allUsers, "Charles","n" ));

	}

}
