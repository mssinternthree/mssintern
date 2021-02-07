import java.util.*;  
public class vector {  
       public static void main(String args[]) {  
         
          Vector<String> v = new Vector<String>(3);  
          
          v.add("Tiger");  
          v.add("Lion");  
          v.add("Liger");
          
          System.out.println("Default capacity is: "+v.capacity());  
          System.out.println("Elements are: "+v);  
          								
          v.addElement("Charan");  
          v.addElement("Surya");  
          
          System.out.println("capacity after addition is: "+v.capacity());  
          System.out.println("Elements are: "+v);  
          System.out.println("Size is: "+v.size());  
         
          System.out.println("The first element of the vector is = "+v.firstElement());   
          System.out.println("The first elemrnt of the vector is = "+v.lastElement());  
       }  
}  