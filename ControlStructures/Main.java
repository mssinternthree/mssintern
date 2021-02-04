import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		String a="hello";
		String b=new String("hello");
		String c="hello";
		String d=new String("HELLO");
		String e="HELLO";
		String f=new String("HELLO");
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println();
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a==e);
		System.out.println();
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(a.compareTo(d));
		System.out.println(a.compareTo(e));
		
		a="ashu";
		b="Krishna";
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		
		a="hello";
		System.out.println(System.identityHashCode(a));
		a="ashu";
		c="ashu";
		System.out.println();
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(c));
		
		System.out.println();
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(f));
		
		a="Ashu";
		System.out.println();
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(c));
	}
}
