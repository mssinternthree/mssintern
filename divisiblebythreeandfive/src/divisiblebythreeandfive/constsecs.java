package divisiblebythreeandfive;

public class constsecs {

	static void ConvertSectoDay(int n) 
    { 
        int day = n / (24 * 3600); 
        final int secs = 3600;
        n = n % (24 * secs); 
        int hour = n / secs; 
      
        n %= 3600; 
        int minutes = n / 60 ; 
      
        n %= 60; 
        int seconds = n; 
          
        System.out.println( day + " " + "days " + hour  
                           + " " + "hours " + minutes + " "
                           + "minutes " + seconds + " "
                           + "seconds "); 
    } 
      
    // Driver code  
    public static void main (String[] args)  
    { 
        // Given n is in seconds 
        int n = 129600; 
        ConvertSectoDay(n); 
  

}
}