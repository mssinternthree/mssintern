package maps.java;
import java.util.*;
import java.lang.*;
import java.io.*;
public class properties {
     public static void main(String[] args)
     {
    	 Properties p= new Properties();
    	 try {
    		 FileOutputStream fp=new FileOutputStream("C:/Users/Chinni/Documents/properties/properties.txt");
        	 p.setProperty("Name","Lazar");
        	 p.setProperty("password","Krishna");
        	 p.store(fp,"inserted ");
        	 FileInputStream fp1=new FileInputStream("C:/Users/Chinni/Documents/properties/properties.txt");
        	 p.load(fp1);
        	 System.out.println();
    	     }
    	 catch(Exception e)
    	      {
    		    System.out.println(e);
    	      }
    	 
    	 
     }
     
}
