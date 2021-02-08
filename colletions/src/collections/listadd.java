package collections;
import java.util.ArrayList;
public class listadd {
      public static void main(String[] args)
      {
    	  ArrayList al =new ArrayList();
    	  ArrayList al1 =new ArrayList();
    	  al.add("LAZAR");
    	  al1.add("LAZAR1");
    	  al.add("Krishna");
    	  al1.add("LAZAR");
    	  al.add("Dinesh");
    	  al.add(17);
    	  System.out.println(al);
    	  al.remove(1);
    	  al.removeAll(al1);
    	  al1.clear();
    	  System.out.println(al);
    	  System.out.println(al1);
    	  System.out.println(al.size());
      }
}