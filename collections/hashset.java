package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class hashset {

	public static void main(String[] args) {
		Set<String> a =new TreeSet<String>();
		a.add("z");
		a.add("b");
		a.add("c");
		a.add("a");
		System.out.println(a);
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}