import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

class Sample_one implements Serializable{
	int id;
	String name;
}

public class DeserializationExample {
	public static void main(String...args) throws Exception{
		FileInputStream fi=new FileInputStream("objectfile.txt");
//		Sample_one obj1=new Sample_one(1,"Ashu");
//		Sample_one obj2=new Sample_one(2,"Ramya");
//		Sample_one obj3=new Sample_one(3,"Bhavani");
		
//		ArrayList al=new ArrayList();
//		al.add(obj1);
//		al.add(obj2);
//		al.add(obj3);
		
		ObjectInputStream oi=new ObjectInputStream(fi);
		ArrayList al=new ArrayList();
		al=(ArrayList)oi.readObject();
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Sample_one m=(Sample_one)i.next();
			System.out.print("\n"+m.id+" "+m.name+"\n");
		}
	}
}
