package maps.java;
import java.io.*;
import java.lang.*;
import java.util.*;
final class instance2 implements Serializable
{
	int id;
	String name;
}

public class deserializeobj  {
           public static void main(String[] args) throws Exception 
           {
        	   try {
        		   FileInputStream fi =new FileInputStream("C:/Users/Chinni/Documents/properties/properties.ser");
        		   ObjectInputStream in =new ObjectInputStream(fi);
        		  ArrayList al=(ArrayList) in.readObject();
        		  Iterator i=al.iterator();
        		    while(i.hasNext())
        		     {
        			  instance2 ins=(instance2) i.next();
        			  System.out.println(ins.id + ins.name);
        		     }
        		    fi.close();
        		    System.out.println("done1");
        		  }
        	   catch(Exception e)
        	   {
        		   e.printStackTrace();
        	   }
        	}
         }
