package colls.viewsAndWrappers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//By using views, you can obtain other objects that implement the Collection or Map interfaces
//keySet() returns an object of a class that implements the Set interface and whose methods manipulate the original map.
public class ViewTest {

	public ViewTest() {
		Set<String> set = new HashSet<>(); 
		System.out.println(set.getClass().getName());
		
		Map<String, String> hm = new HashMap<>();
		hm.put("key1", "val1");
		hm.put("key2", "val2");
		
		Set<String> hs = hm.keySet();
		System.out.println(hs.getClass().getName());
		
		List<String> list = Arrays.asList("1","2","3");
		System.out.println(list.getClass().getName());
		//list.add("4");	//Exception in thread "main" java.lang.UnsupportedOperationException
		
		List<String> names = Collections.nCopies(10, "John");
		System.out.println(names.getClass().getName()+", size: "+names.size());
		//names.add("Abc");	//Exception in thread "main" java.lang.UnsupportedOperationException
		
		Set<String> nams = Collections.singleton("John");
		System.out.println(nams.getClass().getName());
		
		List<String> nms = Collections.singletonList("John");
		System.out.println(nms.getClass().getName());
		
		Map<String, String> ns = Collections.singletonMap("John", "Connor");
		System.out.println(ns.getClass().getName());
	}

	public static void main(String[] args) {
		new ViewTest();
	}

}
