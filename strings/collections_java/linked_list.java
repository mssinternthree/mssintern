package collections_java;
import java.util.*;  
public class linked_list {
	public static void main(String[] args) {
		LinkedList al=new LinkedList();  
		  al.add(1);  
		  al.add(2);  
		  al.add(3);  
		  al.add(4);  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}  
}


