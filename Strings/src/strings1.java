
public class strings1 {
       public static void main(String args[])
       {
	   String s= "Lazar";
	   String s1= "LAzar";
	   String s2= new String("aseroplane");
	   String s3= new String("ap");
	   System.out.println(s);
	   System.out.println(s1);
	   System.out.println(s==s1);
	   System.out.println(s1==s2);
	   System.out.println(s2.equalsIgnoreCase(s3));
	   System.out.println(s2.compareTo(s3));
       }
	
}
