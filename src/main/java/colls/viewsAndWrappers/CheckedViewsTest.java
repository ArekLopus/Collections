package colls.viewsAndWrappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

//It is actually possible to smuggle elements of the wrong type into a generic collection.
//A checked view can detect this problem.
public class CheckedViewsTest {

	public CheckedViewsTest() {
		Collection <String> col = Arrays.asList("One", "Two", "Three");
		List<String> list = col.stream().collect(Collectors.toList());
		System.out.println(list);
		
		List rawList = list;
		rawList.add(new Date());	//The erroneous add command is not detected at runtime. Instead, a class cast exception will happen later when another part of the code calls get and casts the result to a String
		
		List<String> safeStrings = Collections.checkedList(list, String.class);
		List rawList2 = safeStrings;
		//rawList2.add(new Date());	//Exception in thread "main" java.lang.ClassCastException: Attempt to insert
									//class java.util.Date element into collection with element type class java.lang.String
		
		
		//Collections.checkedCollection
		//Collections.checkedList
		//Collections.checkedMap
		//Collections.checkedNavigableMap
		//Collections.checkedNavigableSet
		//Collections.checkedQueue
		//Collections.checkedSet
		//Collections.checkedSortedMap
		//Collections.checkedSortedSet
	}

	public static void main(String[] args) {
		new CheckedViewsTest();
	}

}
