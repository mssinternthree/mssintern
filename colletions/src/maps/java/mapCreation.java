package maps.java;
import java.util.*;
import java.lang.*;
public class mapCreation {
    public static void main(String[] args)
    {
    	 int marks=0; String s1=new String();String s2=new String();String s3=new String();
    	Scanner obj=new Scanner(System.in);
    	Map<Integer, String> m1=new HashMap();
    	Map<Integer , String> m2=new HashMap();
    	Map<Integer , String> m3=new HashMap();
    	m1.put(1,": who is vennela\nA.  Nibba\nB.  Sompapidi\nC.  Karpuram\nD.  All of the Above\n");
    	 m1.put(2,": Number one nibba in our class\nA.  Sagar\nB.  Sirish\nC.  Swarna\nD.  All of the Above\n ");
       m1.put(3,": Lazar has _____ girlfriends\nA.  Uncountable\nB.  7\nC.  9\nD.  19");
       
        
         for(Map.Entry<Integer,String> m : m1.entrySet()) 
        	{
        	System.out.println(m.getKey()+" "+m.getValue());
             if(m.getKey()==1)
             {
            	
            	 System.out.println("Enter your Answer:");
              	  s1=obj.next(); 
              	 m2.put(1,s1);
              	 //System.out.println(s1.charAt(0));
             }
             else if(m.getKey()==2) {
            	 System.out.println("Enter your Answer:");
              	 s2=obj.next();
              	m2.put(2,s2);
             }
             else if(m.getKey()==3)
             {
            	 System.out.println("Enter your Answer:");
             	 s3=obj.next();
             	m2.put(3,s3);
             }
        	
        	}
         System.out.println("\nYour Answer Sheet\n");
         for(Map.Entry<Integer,String> map1 : m2.entrySet())
         {
        	
        	 System.out.println(map1.getKey()+" "+map1.getValue());
         }
        
		if(s1.charAt(0)=='D'||s1.charAt(0)=='d')
         {
        	marks++ ;
			//System.out.println("You got 100%");
         }
        if (s2.charAt(0)=='D'||s2.charAt(0)=='d')
         {
        	 marks++;
        	// System.out.println("You got 50%");
         }
         if(s3.charAt(0)=='A'||s3.charAt(0)=='a')
         {
        	 marks++;
        	// System.out.println("You got 30%, Just passed");
         }
         System.out.println(marks);
		if(marks==3)
		{
			System.out.println("You got 100%");
		}
		else if(marks==2)
		{
			System.out.println("You got 70%");
		}
		else if(marks==1)
		{
			System.out.println("You got 30%, Just passed");
		}
		else
        {
       	 System.out.println("Sorry, You Failed.....Pakkelli Aaduko");
        }
        
    }
}
