package mycollections;
import java.util.*;

public class collectionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Surya");
		list.add("teja");
		list.add("Tarun");
		list.add("Sai");
		list.add("hello");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}