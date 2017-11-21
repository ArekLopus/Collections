package colls.map;

import java.util.EnumMap;

import colls.additionalClasses.User;
import colls.additionalClasses.Weekday;

public class EnumMapTest {
	
	public EnumMapTest() {
		
		EnumMap<Weekday, User> personInCharge = new EnumMap<>(Weekday.class);
		personInCharge.put(Weekday.MONDAY, new User("Arek", "Garek"));
		personInCharge.put(Weekday.TUESDAY, new User("Jarek", "Farek"));
		
		System.out.println(personInCharge.keySet());
		System.out.println(personInCharge.values());
	}

	public static void main(String[] args) {
		new EnumMapTest();
	}

}