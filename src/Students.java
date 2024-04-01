
public class Students extends NewUser implements TalkInterface {
	public boolean verified = true;
	public String major;
	


		//	 overriding methods 
		@Override
//		public  void sayHello() {
////			super.sayHello(); 
//		System.out.println("Hi my major is " + major + ". My name is "+ firstName + " " + lastName);
//		};
//				
	// Constructors
//		public Students(){
//			System.out.println("Creating a student");
//		}
	
	//Custom Constructor

		public Students(String fn, String ln) {
//		super(fn,ln);
			firstName = fn;
			lastName = ln;
	}

		
		
	

	
	
	
}
