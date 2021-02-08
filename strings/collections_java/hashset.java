package collections_java;
import java.util.*;  
class hashset {
	public static void main(String args[]){  
	HashSet <String> set=new HashSet <String>();
	set.add("sravya"); 
	set.add("kavya");  
	set.add("sri");  
	set.add("ananya");  
	set.add("ananya"); 
	Iterator itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  

