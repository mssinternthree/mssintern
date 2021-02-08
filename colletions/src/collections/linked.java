package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
public class linked {
      public static void main(String[] args)
      {
    	  LinkedList l=new LinkedList();
    	  
    	  l.add("LAZAR");
    	  l.add("LAZAR1");
    	  l.add("Krishna");
    	  l.add("LAAR");
    	  l.add("Dinesh");
    	  l.add(17);
    	  System.out.println(l);
    	  Iterator i=l.iterator();
    	  while(i.hasNext())
    	  {
    		  System.out.println(i.next());
    	  }
    	  
      }
}