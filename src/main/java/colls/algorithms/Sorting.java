package colls.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Sorting implements Comparator<String>{

	public Sorting() {
		
		String[] values = new String[] {"One", "Two", "Three", "Four"};
		List<String> list = new ArrayList<>(Arrays.asList(values));
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, this);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder(this));
		System.out.println(list);
	}
	
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
	
	public static void main(String[] args) {
		new Sorting();

	}
	
}
