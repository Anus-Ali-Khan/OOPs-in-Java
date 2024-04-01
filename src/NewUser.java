
public abstract class NewUser implements TalkInterface {

	public String firstName;
	public String lastName;
//	public boolean verified = false;
	
	//Creating a Method in this class and then overriding it in Derived class (Virtual Java)
	//Note: Static and private  methods are not virtual
	
//	public void sayHello() {
//		System.out.println("Hi! I'm a user. My name is " + firstName +" " + lastName);
//	}
	
	//abstract classes - this prevent us to instantiate the class (the only way to get value from abstract classes is to create extended classes )
	// public abstract class NewUser{} - syntax
	
	//Abstract method - it does not allow to pass body in the method 
	// public abstract void sayHello();	-- but we can pass different bodies of this class to its extended classes
	
//	public abstract void sayHello();
	
	//Invoke class with super keyword
//	public void sayHello() {
////	System.out.println("User Version");
//		System.out.println(firstName+ " " + lastName);
//	}
	
	//read only fields assigned with constructors
	
//	private String firstName;
//	private String lastName;
//	
//	public NewUser(String fn, String ln) {
//		firstName = fn;
//		lastName = ln;
//	}
	
	//Final Method - if we don't want to change any method in extend classes so we use Final keyword means extend classes cannot provide their own implementation.
	// i.e. don't override it 
	public final void sayHello() {
	};
	
	//Final  Classes - if we don't want to extend any class or end the inheritance heirachy we use "final" keyword with that class
	
}
