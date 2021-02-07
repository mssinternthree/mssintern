import java.util.*;
import java.io.*;

public class systemProps {
	public static void main(String[] args) throws Exception {

		Properties p = System.getProperties();
		Set s = p.entrySet();

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry e = (Map.Entry) itr.next();
			System.out.println(e.getKey() + " = " + e.getValue());
		}

	}
}