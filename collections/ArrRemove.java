package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrRemove {

	public static void main(String[] args) {
		ArrayList li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add("sai");
		System.out.println("before removing item in list");
		System.out.println(li);
		li.remove(4);
		System.out.println("After removing item(\"sai\") in list");
		System.out.println(li);

	}

}
