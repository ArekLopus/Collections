package colls.set;

import java.util.LinkedHashSet;

import colls.additionalClasses.User;

//Remembers in which order you inserted items
public class LinkedHashSetTest {

	public LinkedHashSetTest() {
		LinkedHashSet<User> lhs = new LinkedHashSet<>();
		User u1 = new User("Arek","Garek");
		User u2 = new User("Darek","Sarek");
		User u3 = new User("Jarek","Farek");
		lhs.add(u1);
		lhs.add(u3);
		lhs.add(u2);
		
		for(User u : lhs) {
			System.out.println(u);
		}
	}

	public static void main(String[] args)  {
		new LinkedHashSetTest();
	}
}
