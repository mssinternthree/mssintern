package string;

import java.util.Scanner;

public class CustomException extends MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int mainbalance = 10000;
		System.out.println("Enter amount to be withdrawed : ");
		int withdraw = sc.nextInt();
		try {
			if (withdraw > mainbalance) {
				throw new MyException();
			} else {
				System.out.println("Withdraw is successful !");
			}

		} catch (MyException e) {
			System.out.println("Withdraw is not possible ! ");
		}
		finally{
			System.out.println("Im finally block!!");
		}
	}

}

class MyException extends Exception {
	public MyException() {
		System.out.println("This is a exception !!!");
	}
}
