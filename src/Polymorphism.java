import java.util.ArrayList;
import java.util.List;

public class Polymorphism { //it allows us to use its derived classes as a main class from which they are derived

	public static void main(String[] args) {
		Students s = new Students();
		s.major = "Mustache designnnn";
		s.firstName = "smartie";
		s.lastName = "Not a candy";
		
		
		Teacher t = new Teacher();
		t.firstName = "Teach";
		t.lastName = "er";
		
		List<NewUser> users = new ArrayList<NewUser>();
		users.add(s); 
		users.add(t);
		
		for(NewUser u:users) {
			u.sayHello();
		}

	}

}
