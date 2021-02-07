import java.io.*;
public class serNdeser implements Serializable {
   int a = 1, b = 2;
   transient int c = 3;
   public static void main(String[] args) throws Exception {
	   serNdeser obj = new serNdeser();
      // serialization
      FileOutputStream fos = new FileOutputStream("serialization.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(obj);
      // de-serialization
      FileInputStream fis = new FileInputStream("serialization.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
      serNdeser test = (serNdeser)ois.readObject();
      System.out.println("a = " + test.a);
      System.out.println("b = " + test.b);
      System.out.println("c = " + test.c);
   }
}