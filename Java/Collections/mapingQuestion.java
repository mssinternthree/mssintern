import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class mapingQuestion {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		int var = 1;
		int value, counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Begin the test and enter options as number only from 1 to 4");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Capital of Australia?");
		map.put(2, "First Planet in solar system?");
		map.put(3, "President of USA? ");
		map.put(4, "Covid was discovered in the year?");
		Map<Integer, String> op = new HashMap<Integer, String>();
		op.put(1, "1.Conberra 2.Delhi 3.Washington 4.Coloumbo");
		op.put(2, "1.Pluto 2.Jupiter 3.Mercury 4.Saturn");
		op.put(3, "1.Trump 2.Obama 3.Bush 4.Biden");
		op.put(4, "1.2017 2.2019 3.2020 4.2018");
// Traversing Map
		Map<Integer, Integer> ans = new HashMap<Integer, Integer>();
		ans.put(1, 1);
		ans.put(2, 3);
		ans.put(3, 4);
		ans.put(4, 2);
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		Set<?> map1 = map.entrySet();// Converting to Set so that we can traverse through the first map
		Set<?> op1 = op.entrySet();// converting to set2 so that we can traverse through the second map
		Set<?> set3 = ans.entrySet();
		Iterator<?> itrmap1 = map1.iterator();
		Iterator<?> itrop = op1.iterator();
		Iterator<?> itr3 = set3.iterator();
		while (itrmap1.hasNext() && itrop.hasNext()) {
// Converting to Map.Entry so that we can get key and value separately
			@SuppressWarnings("rawtypes")
			Map.Entry entrymap = (Map.Entry) itrmap1.next();
			@SuppressWarnings("rawtypes")
			Map.Entry entryop = (Map.Entry) itrop.next();
			@SuppressWarnings("rawtypes")
			Map.Entry entry3 = (Map.Entry) itr3.next();
			System.out.println(entrymap.getKey() + " " + entrymap.getValue());
			System.out.println(entryop.getValue());
			System.out.println("Enter the answer");
			value = sc.nextInt();
			map2.put(var, value);
			var = var + 1;
		}
		Set<?> set4 = map2.entrySet();
		Set<?> set5 = ans.entrySet();
		Iterator<?> itrmap2 = set4.iterator();
		Iterator<?> itrmap5 = set5.iterator();
		while (itrmap2.hasNext() && itrmap5.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry3 = (Map.Entry) itrmap2.next();
			@SuppressWarnings("rawtypes")
			Map.Entry entry4 = (Map.Entry) itrmap5.next();
			if (entry3.getValue() == entry4.getValue()) {
				counter = counter + 1;
			}

		}
		if (set3.equals(set4)) {
			System.out.println("you passed the test");
		}
		System.out.println("your score is " + counter + " of 4");
	}

}