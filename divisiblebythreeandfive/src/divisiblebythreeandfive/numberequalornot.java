package divisiblebythreeandfive;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class numberequalornot {

	public static boolean isNumBalanced(int n) {
		char[] num = num_to_arr(n);
		HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (hp.containsKey(num[i])) {
				hp.put(num[i], hp.get(num[i]) + 1);
			}
			else {
				hp.put(num[i], 1);
			}
		}
		@SuppressWarnings("rawtypes")
		Collection c = (Collection) hp.values();
		Iterator<?> iterator = c.iterator();
		int temp = (Integer) iterator.next();

		while (iterator.hasNext()) {
			if ((int) iterator.next() != temp) {
				return false;
			}
		}
		return true;
	}
	public static char[] num_to_arr(int num) {
		String str = Integer.toString(num);
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		return arr;
	}
	public static void main(String[] args) {
		int n_1 = 1234567890;

		// Function call
		if (isNumBalanced(n_1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");

		}
	}

}
