package colls.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Shuffle implements Comparator<String>{

	public Shuffle() {
		
		String[] values = new String[] {"One", "Two", "Three", "Four"};
		List<String> list = new ArrayList<>(Arrays.asList(values));
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		List<Integer> list2 = Stream.iterate(1, (x) -> x+1 ).limit(49).collect(Collectors.toList());
		Collections.shuffle(list2);
		list2 = list2.subList(0, 6);
		Collections.sort(list2);
		System.out.println(list2);
		
	}
	
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
	
	public static void main(String[] args) {
		new Shuffle();

	}
	
}
