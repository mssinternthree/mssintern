package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrRetainAll {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(0,4);//adding at particular location
	
		list1.add(5);
		
		list2.add(3);
		list2.add(5);
		Iterator i= list1.iterator();
		 System.out.println("before retain");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		list1.retainAll(list2);
		 System.out.println("after retain");
		Iterator l= list1.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}

	}

}
