package collections;
import java.util.ArrayList;
import java.util.Iterator;
class Students{
	int i;
	String s;
	Students(int i,String s){
		this.i=i;
		this.s=s;
	}
}
public class ArrayliObj {
	public static void main(String[] args) {
		Students s1=new Students(1," sai");
		Students s2=new Students(2," ashu");
		Students s3=new Students(3," ravi kiran");
		ArrayList li=new ArrayList();
		li.add(s1);
		li.add(s2);
		li.add(s3);
	//	li.add(2) ---> Exception in thread "main" java.lang.ClassCastException:
	//												java.lang.Integer cannot be cast to collections.Students
	//      	  ---> at collections.ArrayliObj.main(ArrayliObj.java:24)
		Iterator i= li.iterator();
		while(i.hasNext()) {
			Students s = (Students) i.next();
			System.out.println(s.i+s.s);
		}
	}

}
