package colls.viewsAndWrappers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifableViewsTest {

	public UnmodifableViewsTest() {
		Collection <String> col = Arrays.asList("One", "Two", "Three");
		List<String> list = col.stream().collect(Collectors.toList());
		System.out.println(list);
		list.add("Four");
		System.out.println(list);
		
		List<String> ul = Collections.unmodifiableList(list);
		System.out.println(ul.getClass().getName());
		//uc.add("Five");	//Exception in thread "main" java.lang.UnsupportedOperationException
		
		//Collections.unmodifiableCollection
		//Collections.unmodifiableList
		//Collections.unmodifiableSet
		//Collections.unmodifiableSortedSet
		//Collections.unmodifiableMap
		//Collections.unmodifiableSortedMap
	}

	public static void main(String[] args) {
		new UnmodifableViewsTest();
	}

}
