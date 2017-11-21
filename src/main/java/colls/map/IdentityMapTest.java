package colls.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

import colls.additionalClasses.User;

//The keys are computed by the System.identityHashCode()
//Ffor comparison of objects, the IdentityHashMap uses ==, not equals.
//Different key objects are distinct even if they have equal contents. 
public class IdentityMapTest {
	
	public IdentityMapTest() {
		
		IdentityHashMap<User, String> users = new IdentityHashMap<>();
		User u1 = new User("Arek", "Garek");
		User u2 = new User("Arek", "Garek");
		System.out.println("Object equal? : "+u1.equals(u2)+"\n");
		users.put(u1, "user1");
		users.put(u2, "user2");
		
		users.forEach(this::cons);
		System.out.println();
		
		HashMap<User, String> users2 = new HashMap<>();
		users2.put(u1, "user1");
		users2.put(u2, "user2");
		users2.forEach(this::cons);
	}
	
	private void cons(User k, String v) {
		System.out.println("Key: "+k+", value: "+v);
	}
	
	public static void main(String[] args) {
		new IdentityMapTest();
	}

}

