package exceptionHandling;
import java.util.Scanner;
class MyException extends Exception 
{ 
	public MyException(String s) 
	{ 
		super(s); 
	} 
} 
public class TryCatch 
{ 
	public static void main(String args[]) 
	{ 
		String user="saikrishna";
		String Password="987";
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		int t=1;
while(i<3 && t==1) {
	System.out.println("enter user");
	String s1=scan.nextLine();
	System.out.println("enter password");
	String s2=scan.nextLine();
	int balance=5000;
	 int check_usr=s1.compareTo(user);
	 int check_pass =s2.compareTo(Password);
	 try {
		 if(check_usr==0&&check_pass==0) {
			   
				System.out.printf("select option\n1:withdraw\n2:deposit\n3:balance\n4:exit");
				int op=scan.nextInt();
				if(op ==1) {
					System.out.printf("enter amount you want to withdraw");
					int with=scan.nextInt();
					if(with>balance) {
						throw new MyException("insufficient balance");
					}else {
						System.out.println("success");
						balance=balance-with;
						System.out.printf("want to see menu\n1:yes\n2:no");
						int m=scan.nextInt();
						if(m==1) {
							t=1;
						}else if(m==2) {
							t=0;
						}else {
							throw new MyException("invalid option");
						}
					}
				}else if(op==2) {
					System.out.printf("enter amount you want to deposit");
					int with=scan.nextInt();
					if(with<500) {
						throw new MyException("enter amount >500");
					}else {
						System.out.println("success");
						balance=balance+with;
						System.out.printf("want to see menu\n1:yes\n2:no");
						int m=scan.nextInt();
						if(m==1) {
							t=1;
						}else if(m==2) {
							t=0;
						}else {
							throw new MyException("invalid option");
						}
					}
				}else if(op==3) {
					t=0;
					System.out.println(balance);
				}else if(op==4) {
					break;
				}else{
					t=0;
					throw new MyException("invalid option");
					
				}
				}
			else {
				i+=1;
				throw new MyException("invalid credintials");
			}
	 }catch(MyException e) {
		 System.out.println(e.getMessage());
	 }
		
	}
		

	
	} 
} 
