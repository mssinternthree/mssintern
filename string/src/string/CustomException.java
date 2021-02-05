package string;

import java.util.Scanner;

public class CustomException extends MyExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int mainbalance = 10000;
		System.out.println("Enter amount to be withdrawed : ");
		int withdraw = sc.nextInt();
		try {
			if (withdraw > mainbalance) {
				throw new MyExceptions();
			} else {
				System.out.println("Withdraw is successful !");
			}

		} catch (MyExceptions e) {
			System.out.println("Withdraw is not possible ! ");
		}
		finally{
			System.out.println("Im finally block!!");
		}
	}

}

class MyExceptions extends Exception {
	public MyExceptions() {
		System.out.println("This is a exception !!!");
	}
}
