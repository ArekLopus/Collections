package colls.legacyCollections;

import java.util.Stack;

public class StackTest {

	public StackTest() {
		
		Stack<String> st = new Stack<>();
		st.push("One");
		st.push("Two");
		st.push("Three");
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
