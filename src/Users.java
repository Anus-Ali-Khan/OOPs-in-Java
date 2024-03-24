
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
		return firstName.toUpperCase();
	}
	
	public String getLastName() {
		return lastName.toUpperCase();
	}
	
	//since we have made firstName as private variable now so we can only access it through "setters"
	public void setFirstName(String fn) { // here we are not returning but giving an argument so we can used void
		firstName = fn;
	}
	
	public void setLastName(String ln) { // here we are not returning but giving an argument so we can used void
		lastName = ln;
	}
	
	
}
