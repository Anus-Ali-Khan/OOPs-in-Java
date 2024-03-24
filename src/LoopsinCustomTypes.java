import java.util.ArrayList;
import java.util.List;

public class LoopsinCustomTypes {

	public static void main(String[] args) {
		
		String[] firstNames = {"Caleb", "Sub","Sally","Jamie"};
		String[] lastNames = {"Curry","Scriber","Smith","Cal"};
		
		List<Users> allUsers = new ArrayList<Users>();
		
		for(int i=0; i < firstNames.length; i++) {
			Users u = new Users();
			u.setFirstName(firstNames[i]);
			u.setLastName(lastNames[i]);
			allUsers.add(u);
		}
		
		for(Users u : allUsers) {
			System.out.println(u.getFullName());
		}
	}

}
