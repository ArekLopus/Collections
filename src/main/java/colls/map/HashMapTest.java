package colls.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import colls.additionalClasses.User;

public class HashMapTest {

	public HashMapTest() {
		Map<String, User> staff = new HashMap<>(); // HashMap implements Map
		User u1 = new User("Arek","Garek");
		User u2 = new User("Darek","Sarek");
		staff.put("user1", u1);
		staff.put("user2", u2);
		
		System.out.println("True val: "+staff.get("user1"));
		System.out.println("No value: "+staff.get("user11"));
		System.out.println();
		
		System.out.println(staff.keySet());
		System.out.println(staff.values());
		System.out.println(staff.entrySet());
		System.out.println();
		
		Set<Map.Entry<String, User>> es = staff.entrySet();
		Map.Entry<String, User> me = es.iterator().next();
		System.out.println(me.getKey());
		System.out.println(me.getValue());
		
		for (Map.Entry<String, User> entry : staff.entrySet()) {
		    String key = entry.getKey();
		    User value = entry.getValue();
		    //do something with key, value
		    key = key+String.valueOf(value);
		}
	}
	
	public static void main(String... args) {
		new HashMapTest();
	}

}
