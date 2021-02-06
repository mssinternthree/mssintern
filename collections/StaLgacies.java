package collections;
import java.util.Stack;
public class StaLgacies {

	public static void main(String[] args) {
		Stack<Integer> s =new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		s.pop();
		s.push(4);
		System.out.println("top element in stack");
		System.out.println(s.peek());
		System.out.println("searching 2 in stack");
		System.out.println(s.search(2));
		System.out.println("size of stack");
		System.out.println(s.size());
		
	}

}
