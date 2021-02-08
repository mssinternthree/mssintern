package collections_java;
import java.util.*;
public class Question_paper {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1,"Best programming language of 2021?");
		hm.put(2,"Among which is object oriented programming language?");
		HashMap<Integer,String> hm1=new HashMap();
		hm1.put(1,"Python");
		hm1.put(2,"Java");
		hm1.put(3,"Both");
		hm1.put(4,"None of them");
		HashMap<Integer,Integer> hm2=new HashMap();
		for(Map.Entry a:hm.entrySet())
		{
		System.out.println(a.getKey()+""+a.getValue());
		for(Map.Entry b:hm1.entrySet())
			System.out.println(b.getKey()+""+b.getValue());
		System.out.println("enter your choice:");
		int c=sc.nextInt();
		int b=(int) a.getKey();
		if(b==c)
		{
			count++;
		}
		}
		System.out.println("You got "+count+" Out of 2 marks");
}
}