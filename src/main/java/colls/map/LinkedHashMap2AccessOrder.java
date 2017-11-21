package colls.map;

import java.util.LinkedHashMap;

import colls.additionalClasses.User;

//Access order - Every time you call get() or put(), the affected entry is removed from its current position
//and placed at the end of the linked list of entries.
public class LinkedHashMap2AccessOrder {

	public LinkedHashMap2AccessOrder() {
		
		LinkedHashMap<String, User> lhm = new LinkedHashMap<>(100, 0.75F, true);
		User u1 = new User("Arek","Garek");
		User u2 = new User("Darek","Sarek");
		User u3 = new User("Jarek","Farek");
		lhm.put("user1", u1);
		lhm.put("user3", u3);
		lhm.put("user2", u2);
		lhm.put("user1", u1);	//put at the end
		
		for(String s : lhm.keySet()) {
			System.out.println(s);
		}
		System.out.println();
		
		for(User u : lhm.values()) {
			System.out.println(u);
		}
	}

	public static void main(String[] args)  {
		new LinkedHashMap2AccessOrder();
	}
}
