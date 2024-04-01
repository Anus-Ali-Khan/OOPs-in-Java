import java.util.ArrayList;
import java.util.List;

public class InterfacesClass {

	public static void main(String[] args) {
		
		//Calling Interfaces
		
		Students s = new Students("Caleb","Curry");
		s.sayHello();
	
		List<TalkInterface> thingsThatTalk = new ArrayList<TalkInterface>();
		thingsThatTalk.add(s);

	}

}
