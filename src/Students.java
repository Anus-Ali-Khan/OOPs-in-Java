
public class Students extends NewUser {
	public boolean verified = true;
	public String major;
	
	// overriding methods 
				@Override
				public  void sayHello() {
					System.out.println("Hi my major is " + major + ". My name is "+ firstName + " " + lastName);
				}

	
	
	
}
