package internjava;
public class primenumbers {
		public static void main(String args[])
		{  
			System.out.println("prime numbers from 1 to 10 are");
			for(int i=1;i<10;i++)
			{   int count=0;
				for(int j=1;j<i;j++)
				{
				if(i%j==0)
					count++;
			    }
				if(count==1)
			       System.out.println(i);
			}
		}

	}


