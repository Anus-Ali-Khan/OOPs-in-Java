import java.util.ArrayList;
import java.util.List;

public class MethodsOverloading {

	public static void main(String[] args) {
	

		Users me = new Users();
		me.setFirstName("Caleb");
		me.setLastName("Curry");
		
		Users you = new Users();
		you.setFirstName("Charles");
		
		List<Users> allUsers = new ArrayList<Users>(); 
		allUsers.add(me);
		allUsers.add(you);
		
		System.out.println(me.output());
		System.out.println(me.output(true));
		System.out.println(me.output(false));
	}

}
