package divisiblebythreeandfive;

public class seconds {
	static void ConvertHours(int n) 
	{ 
	 int minutes, seconds; 
	  
	    minutes = n * 60; 
	    seconds = n * 3600; 
	  
	    System.out.println( "Minutes = " + minutes 
	        + ", Seconds = " + seconds); 
	} 
	  
	// Driver code 
	    public static void main (String[] args) { 
	    int n = 5; 
	    ConvertHours(n); 
	    } 
}
