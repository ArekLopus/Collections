package colls.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

	public LinkedListTest() {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Arek1");
		ll.add("Arek2");
		ll.add("Arek3");
		
		ListIterator<String> li = ll.listIterator();
		li.add("ArekNew");
		li.next();
		li.add("ArekNew2");
		li.add("ArekNew3");
		ll.add("Arek4");
		
		//li.add("ArekNew4");	//ERROR - Exception in thread "main" java.util.ConcurrentModificationException
		
		ListIterator<String> li2 = ll.listIterator();
		li2.add("ArekNewNew");
		li2.next();
		li2.previous();
		li2.remove();
		
		System.out.println("Next: "+li.nextIndex());
		System.out.println("Prev: "+li.previousIndex());
		
		for(String s: ll) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new LinkedListTest();

	}

}
