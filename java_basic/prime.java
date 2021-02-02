package java_day1;

public class prime {
   public static void main(String[] args)
   {
	   int count;
	
	  
	   for(int i=1;i<=10;i++)
	   {
		   count=0;
		   for(int j=1;j<=i;j++)
		   {
			   
		   if( i%j==0)
		   {
		   count=count+1;
		   }
	      }
		   if(count==2)
		   {
			   System.out.println(i+" is a prime number");
		   }
		}
	   
   }
}
