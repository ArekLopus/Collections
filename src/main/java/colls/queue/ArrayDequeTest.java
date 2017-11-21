package colls.queue;

import java.util.ArrayDeque;

public class ArrayDequeTest {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.offer("One");
		ad.add("Two");
		ad.offer("Three");
		
		System.out.println(ad.remove());
		System.out.println(ad.removeLast());
		
		System.out.println("Size: "+ad.size());
		
		System.out.println(ad.peek());
		System.out.println(ad.element());
		
	}
}
