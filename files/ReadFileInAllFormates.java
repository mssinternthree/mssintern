package files;
import java.io.*;
public class ReadFileInAllFormates {
	public static void main(String[] args) throws Exception {
		FileInputStream fo =new FileInputStream("test.csv");
		FileReader fr=new FileReader("test.csv");    
		 Reader reader = new FileReader("test.csv");
		 System.out.println(" ");
		  System.out.println("****************reading with inputStream**************");
		  System.out.println("______________________________________________________");
		  System.out.println(" ");
		  System.out.println(" ");
		int ch; 
		  while ((ch = fo.read()) != -1) {
		    System.out.printf("%c",(char)ch); 
		  }
		  System.out.println(" ");
		  System.out.println(" ");
		  System.out.println("******************reading with buffer*****************");
		  System.out.println("______________________________________________________");
		  System.out.println(" ");
		  System.out.println(" ");
		  BufferedReader buffr=new BufferedReader(fr);
		  int i;    
          while((i=buffr.read())!=-1){  
          System.out.print((char)i);  
          } 
          System.out.println(" ");
          System.out.println(" ");
		  System.out.println("**********reading with reader*****************");
		  System.out.println("_______________________________________________");
		  System.out.println(" ");
		  System.out.println(" ");
          int data = reader.read();
          while(data != -1){
              char dataChar = (char) data;
              data = reader.read();
              System.out.printf("%c",dataChar);
          }
	}
}