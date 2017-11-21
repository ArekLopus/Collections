package colls.map;

import java.util.LinkedHashMap;

import colls.additionalClasses.User;

//Remembers in which order you inserted items
public class LinkedHashMap1InsertionOrder {

	public LinkedHashMap1InsertionOrder() {
		LinkedHashMap<String, User> lhm = new LinkedHashMap<>();
		User u1 = new User("Arek","Garek");
		User u2 = new User("Darek","Sarek");
		User u3 = new User("Jarek","Farek");
		lhm.put("user1", u1);
		lhm.put("user3", u3);
		lhm.put("user2", u2);
		
		for(String s : lhm.keySet()) {
			System.out.println(s);
		}
		System.out.println();
		
		for(User u : lhm.values()) {
			System.out.println(u);
		}
	}

	public static void main(String[] args)  {
		new LinkedHashMap1InsertionOrder();
	}
}
