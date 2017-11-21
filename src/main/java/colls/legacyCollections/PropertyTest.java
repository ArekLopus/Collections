package colls.legacyCollections;

import java.util.Enumeration;
import java.util.Properties;

// • The keys and values are strings.
// • The table can be saved to a file and loaded from a file.
// • A secondary table for defaults is used.
public class PropertyTest {

	public PropertyTest() {
		
		Properties props = System.getProperties();
		
		Enumeration<Object> e = props.keys();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+", ");
		}
		System.out.println();
		System.out.println(props.getProperty("os.name"));
		System.out.println(props.getProperty("java.home"));
		System.out.println(props.getProperty("java.vendor"));
		System.out.println(props.getProperty("file.separator"));
		
		//props.store(out, comments);
		//props.storeToXML(os, comment);
	}

	public static void main(String[] args) {
		new PropertyTest();

	}

}
