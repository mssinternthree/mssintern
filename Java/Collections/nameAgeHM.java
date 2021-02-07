import java.util.HashMap;
import java.util.Map;

class Person {
	int age;
	String name;

	Person(int age, String name, HashMap<String, Integer> hmo) {
		this.age = age;
		this.name = name;

		hmo.put(name, age);
	}
}

public class nameAgeHM {
	public static void main(String... args) {
		HashMap<String, Integer> hmo = new HashMap();

		Person o1 = new Person(18, "charan", hmo);
		Person o2 = new Person(22, "surya", hmo);
		Person o3 = new Person(19, "hema", hmo);

		System.out.println("The Persons and Their respective ages are : ");
		for (Map.Entry<String, Integer> m1 : hmo.entrySet()) 
		{
			System.out.println(m1.getKey() + " -> " + m1.getValue());
		}
	}
}