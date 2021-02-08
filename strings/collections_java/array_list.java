package collections_java;
import java.util.*;  
class array_list{  
public static void main(String args[]){  
ArrayList <String> list=new ArrayList <String>();
list.add("sravya"); 
list.add("kavya");  
list.add("sri");  
list.add("ananya");  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  