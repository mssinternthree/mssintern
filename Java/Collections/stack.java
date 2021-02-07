import java.util.*;

public class stack {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("charan");
		stack.push("bhuvan");
		stack.push("surya");
		stack.push("pandu");
		
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}