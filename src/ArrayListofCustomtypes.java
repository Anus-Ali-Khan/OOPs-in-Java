import java.util.ArrayList;
import java.util.List;

public class ArrayListofCustomtypes {

	public static void main(String[] args) {
		Users me = new Users();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		Users you = new Users();
		you.setFirstName("Sub");
		you.setLastName("Scriber");
		
		List<Users> allUsers = new ArrayList<Users>();
		allUsers.add(you);
		allUsers.add(me);
		
		System.out.println(allUsers.get(1).getFullName());

	}

}
