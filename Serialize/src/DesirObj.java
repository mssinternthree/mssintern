import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
class Students implements Serializable {
	
	int i;
	String s;
	Students(int i,String s){
		this.i=i;
		this.s=s;
	}
}
public class DesirObj {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try {
			FileInputStream fi =new FileInputStream("D:\\workspace\\SerializeId\\test.ser");
			ObjectInputStream obje=new ObjectInputStream(fi);
			ArrayList li=(ArrayList) obje.readObject();
			Iterator i= li.iterator();
			while(i.hasNext()) {
				Students s = (Students) i.next();
				System.out.println(s.i+s.s);
			}
			fi.close();
			System.out.println("success");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
