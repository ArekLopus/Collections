package colls.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest implements Comparator<String>{

	public TreeSetTest() {
		
		//Set<String> set = new TreeSet<>();
		Set<String> set = new TreeSet<>(this);
		set.add("Marek");
		set.add("Darek1");
		set.add("Jarek12");
		
		for(String s : set) {
			System.out.println(s);
		}
	}
	
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}	
	
	
	
	
	public static void main(String[] args) {
		new TreeSetTest();

	}

}