package collections_java;
import java.util.*;  
public class hashmap {
	public static void main(String args[]){  
	  Map<Integer,String> map=new HashMap<Integer,String>();  
	  map.put(100,"anupama");  
	  map.put(101,"anusha");  
	  map.put(102,"vennela");  
	  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
		}  