import java.util.Scanner;

class UserException extends Exception{
	UserException(String err){
		System.out.println(err);
	}

public class Bank {
	int amount;
	
	Bank(){
		amount=10000;
	}
	
	public void trasaction() {
		char ch='y';
		int tranchoice;
		int amount;
		Scanner sc=new Scanner(System.in);
		
		loop:
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter your choice :\n1.Withdraw\n2.Deposit\n3.Show Balance\n4.Exit");
			tranchoice=sc.nextInt();
			
			switch(tranchoice) {
				case 1:System.out.println("Enter amount to Withdraw");
						amount=sc.nextInt();	
						try {
							if(amount>this.amount) {
								throw new UserException("Amount insufficient !!!");
							}else {
								this.amount-=amount;
								System.out.println("Amount Debited, Remaining Balance : "+this.amount);
							}
							
						}catch(Exception e) {
							continue loop;
						}
						break;
				case 2:System.out.println("Enter amount to Deposit");
						amount=sc.nextInt();	
						try {
							if(amount<500) {
								throw new UserException("Pakkaki velli aduko");
							}else {
								this.amount+=amount;
								System.out.println("Amount Debited, Remaining Balance : "+this.amount);
							}
						}catch(Exception e) {
							continue loop;
						}
						break;
				case 3:System.out.println("Total balance : "+this.amount);
						break;
						
				case 4:	System.out.println("Trasaction Complete");
						System.exit(0);
				
				default:System.out.println("Invalid Balance !!! ");
 			}
			System.out.println("Want to do any more trasactions : ");
			ch=sc.next().charAt(0);
		}
	}

	 public static void  main(String...args) {
		 Bank obj=new Bank();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Username : ");
		 String uid=sc.nextLine();
		 System.out.println("Enter Password : ");
		 String pass=sc.nextLine();
		 
		 try {
			 if(uid.compareTo("hello")!=0 && pass.compareTo("world")!=0) {
					throw new UserException("Wrong Username or password try again");
			}else {
				obj.trasaction();
			}
		 }catch(Exception onee) {
			 try {
				 System.out.println("Enter Username : ");
				 uid=sc.nextLine();
				 System.out.println("Enter Password : ");
				 pass=sc.nextLine();
				 if(uid.compareTo("hello")!=0 && pass.compareTo("world")!=0) {
						throw new UserException("Wrong Username or password try again");
				}else {
					obj.trasaction();
				}
			 }catch(Exception twoe) {
				 try {
					 System.out.println("Enter Username : ");
					 uid=sc.nextLine();
					 System.out.println("Enter Password : ");
					 pass=sc.nextLine();
					 if(uid.compareTo("hello")!=0 && pass.compareTo("world")!=0) {
							throw new UserException("Wrong Username or password try again");
					}else {
						obj.trasaction();
					}
				 }catch(Exception threee) {
					 System.out.println("Please Try again after some time.");
				 }
			 }
		 }finally {
			 System.out.println("Trasaction Complete");
		 }
	 }
}
