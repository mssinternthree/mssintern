package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Arrlist {
	public static void main(String[] args) {
		ArrayList li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add("sai");
		li.add(5);
		Iterator i= li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
