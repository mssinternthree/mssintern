import java.util.HashSet;
import java.util.Iterator;
public class setExamp {
	public static void main(String[] args) {
		HashSet a = new HashSet();
		a.add(1);
		a.add('a');
		a.add("mes");
		a.add("mes");			//don't allow duplicates
		Iterator i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
	}
		System.out.println("Does the Set contains '?   " + a.contains(1));   
	}
}
