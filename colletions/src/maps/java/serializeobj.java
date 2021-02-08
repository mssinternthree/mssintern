package maps.java;
import java.util.*;
import java.lang.*;
import java.io.*;

 class instance2 implements Serializable{
	 int id;
	 String name;
	 public instance2(int id, String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
	
}

public class serializeobj {
     public static void main(String[] args) throws Exception
     {
    	// Properties p= new Properties();
    	 try {
    		
    		 instance2 i1=new instance2(1,"Lazar");
    		 instance2 i2=new instance2(2,"Krishna");
    		 instance2 i3= new instance2(3,"Dinesh");
    		 instance2 i4=new instance2(4,"Ashu");
    		 ArrayList al =new ArrayList();
       	     //ArrayList al1 =new ArrayList();
       	     al.add(i1);
       	     al.add(i2);
       	     al.add(i3);
       	     al.add(i4);
       	FileOutputStream fp1=new FileOutputStream("C:/Users/Chinni/Documents/properties/properties.ser");
        	 ObjectOutputStream out=new ObjectOutputStream(fp1);
        	 out.writeObject(al);
        	
        	 System.out.println("Done");
    	     }
    	 catch(Exception e)
    	      {
    		    System.out.println(e);
    	      }
    }
     
}
