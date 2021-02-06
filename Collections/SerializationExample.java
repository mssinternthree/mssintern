import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Sample_one implements Serializable{
	int id;
	String name;
	Sample_one(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class SerializationExample {
	public static void main(String...args) throws IOException{
		FileOutputStream fo=new FileOutputStream("objectfile.txt");
		Sample_one obj1=new Sample_one(1,"Ashu");
		Sample_one obj2=new Sample_one(2,"Ramya");
		Sample_one obj3=new Sample_one(3,"Bhavani");
		
		ArrayList al=new ArrayList();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(al);
		
	}
}
