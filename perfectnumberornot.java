package mssintern;

public class perfectnumberornot {

	private static Object scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner scan = new Scanner(System.in);
		System.out.println(" enter num to find perfect or not");
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println(n+" is perfect");
		else
			System.out.println(n+" is not perfect number");

		

	}

}
