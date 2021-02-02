
public class Objectclassmethods {
	public static void main(String[] args) 
    { 
        Objectclassmethods t = new Objectclassmethods(); 
        System.out.println(t.hashCode()); 
  
        t = null; 
  
        // calling garbage collector  
        System.gc(); 
        Objectclassmethods.main(10);
        System.out.println("end");
        System.err.print("Error");
    }  
    public static int main(int args) {
    	System.out.println("hello");
    	return 0;
    }
    @Override
    protected void finalize() 
    { 
        System.out.println("finalize method called"); 
    } 

}
