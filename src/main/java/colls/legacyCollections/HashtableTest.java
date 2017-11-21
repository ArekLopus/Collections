package colls.legacyCollections;

import java.util.Hashtable;


public class HashtableTest {

	public HashtableTest() {
		
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("This", "Is");
		ht.put("Just", "A");
		ht.put("Synchronized", "Map");
		
		System.out.println(ht.keySet());
	}

	public static void main(String[] args) {
		new HashtableTest();

	}

}
