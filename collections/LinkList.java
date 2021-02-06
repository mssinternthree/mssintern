package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>(); 
   
        ll.add(1); 
        ll.add(2); 
        ll.add(3);
        ll.add(4);
        ll.set(1,1);
        ll.remove(2);
        Iterator  i=ll.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
	}

}
