import java.util.List;
import java.util.Objects;

public class Users { // in classes we only define fields(things that we store) here their values are define where object is created
	// fields	
	private String firstName;
	public String lastName; 
	
	//methods 
	//Arguments - all the variables we passed in parenthesis() 
	public void output(int times ) {
		
		for (int i=0 ; i < times ; i++) {
		System.out.println(firstName + " " + lastName);	
		}		
	}
	
	
	// Return - used if we want to save the value in a variable not display in console 
	public String returnOutput() { // in return we did not use void but declare data type of return statement
		return "Hi, my name is " + firstName + " " + lastName + ".";
	}
	
	//Encapsulation - in this we hide the backend information which we don't want to expose to user
	// this is done through getters(gets the value) and setters(sets the values)
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() { // if we use return so we not use void but String,Integer(Data Types) 
		return lastName.toUpperCase();
	}
	
	//since we have made firstName as private variable now so we can only access it through "setters"
	public void setFirstName(String fn) { // here we are not returning but giving an argument so we can used void
		firstName = fn.strip();
	}
	
	public void setLastName(String ln) { // we can also access public variables through setters
		lastName = ln;
	}
	
	//Custom getters and setters
	public String getFullName() {
		return getFirstName() + " " + lastName;
	}
	
	//Static Methods
	public static void printUser(Users u) {
		System.out.println(u.getFullName());
	}
	
	//Static Methods on Lists
	public static void printUsers(List<Users> users) {
		for(Users u : users) {
			System.out.println(u.getFullName());
		}
		
	}
	

	//Methods Overloading - we can make same methods having arguments of different data types
	public String output() {
		return "Hi, my name is " + getFullName() + ".";
	}
	
	public String output(boolean nice) {
		if(nice) {
			return "you are a beautiful person. - " + getFullName() + ".";  
		}
		return "You are a freak. - " + getFullName() + ".";
	}
	
	//Searching a List for custom objects
	public static int searchList(List<Users> users, String fn, String ln) {
		return searchList(users, fn + " " + ln);
	}
	
	public static int searchList(List<Users> users, String fullName ) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getFullName().equals(fullName)) {
				return i;
			}
		}
		return -1;
	}

	//Method Overriding - override a method by generating new method of same name
	@Override
	public String toString() {
		return "Users [getFullName()=" + getFullName() + "]";
	}

	
	//Override Equals
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}
	
	//Overload the search to take in a User Object or Custom data type
	public static int searchList(List<Users> users, Users u){
		return searchList(users, u.getFullName());
		
	}
	
	//Returning Custom Objects 
	public static Users findUser(List<Users> users, Users u) {
		for (Users user:users) {
			if(user.equals(u)) {
				return user;
			}
		}
		return null;
	}
	
	//Passing by Value or Reference
	public static void changeCrap(Users x) {
//		x =new Users(); if we create new object then value does not change
		x.setFirstName("Changed");
	}
	
	
	
	
}
