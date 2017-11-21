package colls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConvertingBetweenCollAndArray {

	public ConvertingBetweenCollAndArray() {

		String[] values = new String[] {"One", "Two", "Three", "Four"};
		
		Set<String> one = new HashSet<>(Arrays.asList(values));
		Set<String> one2 = new TreeSet<>(Arrays.asList(values));
		
		List<String> two = new ArrayList<>(Arrays.asList(values));
		List<String> two2 = new LinkedList<>(Arrays.asList(values));
		
		System.out.println(one);		System.out.println(one2);
		System.out.println(two);		System.out.println(two2);
		System.out.println();
		
		Object[] vals = one.toArray();
		//String[] vals2 = (String[]) one.toArray();	//ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
		
		String[] vals3 = one.toArray(new String[0]);
		String[] vals4 = one.toArray(new String[one.size()]);
		System.out.println(Arrays.asList(vals3));
		System.out.println(Arrays.asList(vals4));
	}

	public static void main(String[] args) {
		new ConvertingBetweenCollAndArray();

	}

}
