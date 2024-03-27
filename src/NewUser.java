
public abstract class NewUser {

	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	//Creating aMethod in This class and then overriding it in Derived class (Virtual Java)
	//Note: Static and private  methods are not virtual
	
//	public void sayHello() {
//		System.out.println("Hi! I'm a user. My name is " + firstName +" " + lastName);
//	}
	
	//abstract classes - this prevent us to instantiate the class (the only way to get vlue from abstract classes is to create extended classes )
	// public abstract class NewUser{} - syntax
	
	//Abstract method - it does not allow to pass body in the method 
	// public abstract void sayHello();	-- but we can pass different bodies of this class to its extended classes
	
	public abstract void sayHello();
}
