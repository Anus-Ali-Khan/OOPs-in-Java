
class Constructors {

	public static void main(String[] args) {
		
		// Similar to method
		// no use of return data type - public Constructors(){ print statement } // name of constructor must match the class name
		// use with new keyword 
		// syntax - User u = new User(); this is default constructor
		
		//Custom Constructors - in this we can pass arguments in parenthesis
		Students s = new  Students("smartie", "Not a candie");
		System.out.println(s.firstName);
	}

}
