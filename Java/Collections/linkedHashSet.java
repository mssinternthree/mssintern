import java.util.*;

class linkedHashSet {
	public static void main(String args[]) {
		LinkedHashSet set = new LinkedHashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Five");  //no duplicates
		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}