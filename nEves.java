import java.util.Scanner;

public class nEves {

	public static void main(String[] args) {
		
				Scanner scan = new Scanner(System.in);
				 System.out.println("enter n to find n eves");
				 int n=scan.nextInt();
				for(int i=1;i<=n*2;i++) {
					if(i%2==0) {
						System.out.println(i);
					}
				}
			}
		}