import java.util.Scanner;
public class PetternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter total number of rows : ");
		int r=in.nextInt();
		
		for(int i=0;i<r;i++){
			System.out.printf("\n");
			for(int j=1;j<=r-i;j++) {
				System.out.printf(" ");
			}
			if(i==0) {
				System.out.printf(" 1");
			}else {
				int no=(int)Math.pow(11, i+1);
				while(no!=0) {
					System.out.printf("%d ",no%10);
					no=no/10;
				}
				
			}
		}
	}

}
