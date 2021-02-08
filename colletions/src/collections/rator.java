package collections;
import java.util.ArrayList;
import java.util.Iterator;
class rator
   {
       int no;
       String name;
	rator(int no, String name)
	{
		//System.out.println("Id: "+no);
		//System.out.println("Name: "+name);
		this.no=no;
		this.name=name;
	}
   }
 class Main 
       {
        
	   public static void main(String[] args)
	   {
		   
		   rator i1= new rator(17,"Lazar");
		   rator i2= new rator(07,"Krishna");
		   rator i3= new rator(69,"Dinesh");
		   ArrayList a=new ArrayList();
		   a.add(i1);
		   a.add(i2);
		   a.add(i3);
		   //a.add(19);
		   Iterator i=a.iterator();
		  // System.out.println(i)
		   while(i.hasNext())
		   {
		       rator r=(rator)i.next();
			 System.out.println(r.no);
			 System.out.println(r.name);
		   }
		   
	   }
}

