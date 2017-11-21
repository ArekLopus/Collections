package colls.map;

import java.util.Date;
import java.util.WeakHashMap;

import colls.additionalClasses.User;

public class WeakHashMapTest {

	public WeakHashMapTest() {
		WeakHashMap<Date, User> staff = new WeakHashMap<>();
		User u1 = new User("Arek","Garek");
		Date key1 = new Date();		//NIE DZIAŁA jak String (String pool?)

		staff.put(key1, u1);

		System.out.println(staff.size());
		key1 = null;
		//System.gc();
		
		for (int i = 0; i < 10000; i++) {
            if (staff.size() != 0) {
                System.out.println("At iteration " + i + " the map still holds the reference on someDataObject");
            } else {
                System.out.println("somDataObject has finally been garbage collected at iteration " + i + ", hence the map is now empty");
                break;
            }
        }
		
	}
	
	public static void main(String... args) {
		new WeakHashMapTest();
	}

}
