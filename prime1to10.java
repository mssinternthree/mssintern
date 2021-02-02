package mssintern;

public class prime1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int num=0;
		int[] primes=new int[10];
		for(i=1;i<=10;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--) {
				if(i%num==0)
				{
					
				counter=counter+1;
				
				}
			}
			if(counter==2)
			{
				primes[i]=i;
			}
		}
			System.out.println("here are the prime numbers from 1to10:");
			for(int i2=0;i2<10;i2++) {
				if(primes[i2]!=0)
					System.out.println(primes[i2]);
				
			}
	}
	

}
