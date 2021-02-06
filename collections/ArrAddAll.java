package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrAddAll {

	public static void main(String[] args) {
		ArrayList li=new ArrayList();
		ArrayList li1=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(0,4);//adding at particular location
		li.add("the above list item should be 4");
		li.add(5);
		Iterator i= li.iterator();
		li1.addAll(li);
		Iterator i1= li1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("list 2");
		while(i1.hasNext()) {
			 System.out.println(i1.next());
		}
	}

}
