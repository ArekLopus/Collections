package colls.bulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BulkOperations {
	
	Collection <String> col = Arrays.asList("One", "Two", "Three");
	Collection <String> col2 = Arrays.asList("Two", "Three", "Four", "Five");
	
	public BulkOperations() {

		List<String> list = new ArrayList<>(col);
		List<String> list2 = new ArrayList<>(col2);
		
		list.retainAll(col2);
		System.out.println("The same in both colls:\t\t"+list);

		list2.removeAll(list);
		System.out.println("Removed the same els from col2:\t"+list2);
		
		List<String> list3 = new ArrayList<>(col);
		list3.addAll(new ArrayList<String>(col2).subList(2, 4));
		System.out.println("col + col2 sublist:\t\t"+list3);
		
		list3.subList(0, 2).clear();
		System.out.println("list3 cleared with sublist :\t"+list3);
	}

	public static void main(String[] args) {
		new BulkOperations();
	}

}
