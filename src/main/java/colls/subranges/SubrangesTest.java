package colls.subranges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SubrangesTest {

	public SubrangesTest() {
		Collection <String> col = Arrays.asList("One", "Two", "Three");
		List<String> list = new ArrayList<>(col);
		List<String> sublist  = list.subList(0, 2);
		//??You can apply any operations to the subrange, and they automatically reflect the entire list??
		//sublist.add("Four");	//Exception in thread "main" java.lang.UnsupportedOperationException
		
		System.out.println(sublist.getClass().getName()+", "+sublist+"\n");
		
		SortedSet<String> ss = new TreeSet<>(col);
		SortedSet<String> ss1 = ss.headSet("Three");
		System.out.println(ss1+", "+ss1.getClass().getName());
		SortedSet<String> ss2 = ss.tailSet("Three");
		System.out.println(ss2);
		SortedSet<String> ss3 = ss.subSet("One","Two");
		System.out.println(ss3+"\n");
		
		SortedMap<String, Integer> sm = new TreeMap<>();
		sm.put("One", 1);
		sm.put("Two", 2);
		sm.put("Three", 3);
		SortedMap<String, Integer> sm1 = sm.headMap("Three");
		System.out.println(sm1+", "+sm1.getClass().getName());
		SortedMap<String, Integer> sm2 = sm.tailMap("Three");
		System.out.println(sm2);
		SortedMap<String, Integer> sm3 = sm.subMap("One","Two");
		System.out.println(sm3);
		
		//NavigableSet<E> subSet(E from, boolean fromInclusive, E to, boolean toInclusive)
		//NavigableSet<E> headSet(E to, boolean toInclusive)
		//NavigableSet<E> tailSet(E from, boolean fromInclusive)
	}

	public static void main(String[] args) {
		new SubrangesTest();
	}

}
