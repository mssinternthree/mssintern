package collections;

import java.util.ArrayList;
import java.util.Iterator;
class A
   {
       int no;
       String name;
	A(int no, String name)
	{
		//System.out.println("Id: "+no);
		//System.out.println("Name: "+name);
		this.no=no;
		this.name=name;
	}
   }
 class iterates
       {
        
	   public static void main(String[] args)
	   {
		   
		   A i1= new A(17,"Lazar");
		   A i2= new A(07,"Krishna");
		  A i3= new A(69,"Dinesh");
		   ArrayList a=new ArrayList();
		   a.add(i1);
		   a.add(i2);
		   a.add(i3);
		   //a.add(19);
		   Iterator i=a.iterator();
		  // System.out.println(i)
		   while(i.hasNext())
		   {
		       A r=(A)i.next();
			 System.out.println(r.no);
			 System.out.println(r.name);
		   }
		   
	   }
}

