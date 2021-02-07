
import java.util.ArrayList;
import java.util.Iterator;

public class listExamp {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList a = new ArrayList();
		a.add(1);
		a.add('a');
		a.add("mes");
		a.add("mes");
		Iterator i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}