import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Students implements Serializable {

	int i;
	String s;
	Students(int i,String s){
		this.i=i;
		this.s=s;
	}
}
public class Serialobj {

	public static void main(String[] args) throws IOException {
		Students s1=new Students(1," sai");
		Students s2=new Students(2," ashu");
		Students s3=new Students(3," TestCase");
		ArrayList li=new ArrayList();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		try {
			FileOutputStream fi=new FileOutputStream("test.ser");
			ObjectOutputStream obje=new ObjectOutputStream(fi);
			obje.writeObject(li);
			fi.close();
			System.out.println("success");
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
