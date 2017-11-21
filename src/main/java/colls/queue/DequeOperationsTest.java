package colls.queue;

import java.util.ArrayDeque;

public class DequeOperationsTest {
	
//    				First Element (Head) 				   Last Element (Tail) 
//			Throws exception 	Special value 		Throws exception	Special value 
//Insert 	addFirst(e) 		offerFirst(e) 		addLast(e) 			offerLast(e) 
//Remove 	removeFirst() 		pollFirst() 		removeLast() 		pollLast() 
//Examine 	getFirst() 			peekFirst() 		getLast() 			peekLast()
	
//Inherited from Queue
//							  Insert / Remove / Examine 
//Throws exception 			-> add(e) remove() element() 
//Returns special value  	-> offer(e) poll() peek() 	
	
	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.offer("One");
		ad.add("Two");
		ad.offer("Three");
		
		ad.addFirst("Four");
		ad.addLast("Five");
		System.out.println(ad);
		
		System.out.println(ad.getFirst());
		System.out.println(ad);
		System.out.println(ad.peekLast());
		System.out.println(ad);
	}
}

