package colls.algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class BinarySearch implements Comparator<String>{

	public BinarySearch() {
		
		List<Integer> list = Stream.iterate(55, (x) -> x+1 ).limit(100_000).collect(Collectors.toList());
		
		int found = Collections.binarySearch(list, 1000);
		
		if(found >= 0)
			System.out.println("Found: "+found);
		else
			System.out.println("Not Found: "+found);
	}
	
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
	
	public static void main(String[] args) {
		new BinarySearch();

	}
	
}
