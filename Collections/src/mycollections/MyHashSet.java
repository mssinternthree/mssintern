package mycollections;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Tarun");
		set.add("Surya");
		set.add("Tarun");
		set.add("Teja");
		set.add("helper");
		set.add("None");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Hash Set don't have orderly insertion !");
	}

}
