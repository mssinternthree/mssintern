package mycollections;

import java.util.Iterator;
import java.util.LinkedList;

public class Mylinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al = new LinkedList<String>();
		al.add("Surya");
		al.add("Teja");
		al.add("Tarun");
		al.add("Sai");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
