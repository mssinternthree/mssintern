package internjava;

public class stringpractice {
 
	static String s5="sai";
	public static void main(String[] args) {
		String s1="sai";
		System.out.println(s1);
		System.out.println(s5);
		String s2="sai";
		System.out.println(s2);
		String s3= new String("sai");
		System.out.println(s3);
		String s4= new String("sai");
		System.out.println(s4);
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s5));
		
	}  

}
