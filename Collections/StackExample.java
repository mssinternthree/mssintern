import java.util.*;
public class StackExample {
	public static void main(String...args) {
		Stack stobj=new Stack();
		stobj.push(1);
		stobj.push('a');
		stobj.push("ashu");
		
		System.out.println(stobj);
		stobj.pop();
		System.out.println(stobj);
	}
}
