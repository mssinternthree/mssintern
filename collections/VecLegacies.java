package collections;

import java.util.Iterator;
import java.util.Vector;

public class VecLegacies {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		Iterator i=v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		v.remove(2);
		System.out.println("removing 3");
		System.out.println(v);
		
	}

}
