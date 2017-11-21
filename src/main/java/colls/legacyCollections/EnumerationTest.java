package colls.legacyCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;


public class EnumerationTest {

	public EnumerationTest() {
		
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("This", "Is");
		ht.put("Just", "A");
		ht.put("Synchronized", "Map");
		
		Enumeration<String> e = ht.keys();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+", ");
		}
		System.out.println();
		
		Enumeration<String> e2 = ht.elements();
		while(e2.hasMoreElements()) {
			System.out.print(e2.nextElement()+", ");
		}
		System.out.println();
		
		List<String> list = Arrays.asList("One","Two","Three"); 
		Enumeration<String> e3 = Collections.enumeration(list);
		while(e3.hasMoreElements()) {
			System.out.print(e3.nextElement()+", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new EnumerationTest();

	}

}
