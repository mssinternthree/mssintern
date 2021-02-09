import java.util.Scanner;

import java.sql.*;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class bankprojDB {
	public static void main(String args[]) throws SQLException {

		int counter = 0;
		int turn = 1;
		int ls = 1;
		String uname = "";
		String pin = "";
		Scanner scan = new Scanner(System.in);
		while (counter < 3 && turn == 1) {

			if (ls == 1) {
				System.out.println("Enter Name");
				uname = scan.next();
				scan.nextLine();
				System.out.println("Enter Pin --->Alpha-Numeric");
				pin = scan.next();
				scan.nextLine();
			}

			String cname = "";
			String cpin = "";
			int cbal = 0;
			System.out.println("\nConnecting to Your Account ....Please wait a while");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
				System.out.println("\nConnected to BankDB successfully");
				PreparedStatement ps = con.prepareStatement("select name,pin,balance from bank where name=?");
				ps.setString(1, uname);
				ResultSet rset = ps.executeQuery();
				while (rset.next()) {
					cname = rset.getString(1);
					cpin = rset.getString(2);
					cbal = rset.getInt(3);

				}
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			int check_usr = uname.compareTo(cname);
			int check_pin = pin.compareTo(cpin);

			try {
				@SuppressWarnings("unused")
				int i = 0;
				if (check_usr == 0 && check_pin == 0) {
					ls = 0;
					System.out
							.printf("\nSelect option to perform\n1:Withdraw\n2:Deposit\n3:Balance\n4Transfer\n5:Exit\n");
					int op = scan.nextInt();
					if (op == 1) {
						System.out.printf("\nEnter amount to withdraw");
						int wdraw = scan.nextInt();
						if (wdraw > cbal) {
							i += 1;
							throw new MyException("\nInsufficient Funds in your account");

						} else {

							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root",
									"root");
							PreparedStatement ps = con
									.prepareStatement("UPDATE bank SET  balance = ? WHERE (name = ?)");
							cbal = cbal - wdraw;
							ps.setInt(1, cbal);
							ps.setString(2, uname);
							int rs = ps.executeUpdate();
							con.close();
							if (rs == 1) {
								System.out.println("\nAmount withdrawn successfully");
								System.out.println("\nWant to continue again\n1:Yes\n2:No");
								int m = scan.nextInt();
								if (m == 1) {
									turn = 1;
								} else if (m == 2) {
									turn = 0;
								} else {
									i += 1;
									throw new MyException("\nPlease enter a invalid option");
								}
							} else {
								System.out.println("\n404 Error");
							}

						}
					} else if (op == 2) {
						System.out.println("\nEnter amount to deposit");
						int depo = scan.nextInt();
						if (depo < 500) {
							i += 1;
							throw new MyException("\nAmount must be greater than 500 rupees");
						} else {
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root",
									"root");
							PreparedStatement ps = con
									.prepareStatement("UPDATE bank SET  balance = ? WHERE (name = ?)");
							cbal = cbal + depo;
							ps.setInt(1, cbal);
							ps.setString(2, uname);
							int rset = ps.executeUpdate();
							con.close();
							if (rset == 1) {
								System.out.println("\nBalance Updated Succesfully");

								System.out.print("\nWant to continue again\n1:Yes\n2:No");
								int m = scan.nextInt();
								if (m == 1) {
									turn = 1;
								} else if (m == 2) {
									turn = 0;
								} else {
									i += 1;
									throw new MyException("\nOption Invalid");
								}
							} else {
								System.out.printf("\n404 ERROR");
							}

						}
					} else if (op == 3) {
						turn = 0;
						System.out.println(cbal);
						System.out.printf("\nWant to continue again\n1:Yes\n2:No");
						int m = scan.nextInt();
						if (m == 1) {
							turn = 1;
						} else if (m == 2) {
							turn = 0;
						} else {
							i += 1;
							throw new MyException("\nInvalid option");
						}
					} else if (op == 4) {
						turn = 0;

						System.out.printf("\nEnter amount to transfer:");
						int m = scan.nextInt();
						scan.nextLine();
						int transbal = 0;
						System.out.printf("\nEnter Username to transfer");
						String transuser = scan.nextLine();
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root",
								"root");
						System.out.println("\nDebiting "+m+"rupess from your account to "+transuser);
						if (cbal > m) {
							PreparedStatement ps = con
									.prepareStatement("UPDATE bank SET  balance = ? WHERE (name = ?)");
							ps.setInt(1, cbal - m);
							ps.setString(2, uname);
							int rset3 = ps.executeUpdate();
							System.out.println("\nTransfer Successfully done");
						}
						Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root",
								"root");
					//	System.out.println("Connected to your account successfully");
						PreparedStatement ps1 = con1.prepareStatement("select balance from bank where name=?");
						ps1.setString(1, transuser);
						ResultSet rset1 = ps1.executeQuery();
						while (rset1.next()) {
							transbal = rset1.getInt(1);
						}
						PreparedStatement ps2 = con.prepareStatement("UPDATE bank SET  balance = ? WHERE (name = ?)");
						ps2.setInt(1, transbal + m);
						ps2.setString(2, transuser);
						int rset2 = ps2.executeUpdate();
						con1.close();
						System.out.println("\nWant to continue again 1.yes 2.No");
						int op1 = scan.nextInt();

						if (op1 == 1) {
							turn = 1;
						} else if (op1 == 2) {
							turn = 0;
						} else {
							i += 1;
							throw new MyException("\nOption Invalid");
						}
					} else if (op == 5) {
						break;
					} else {
						i += 1;
						throw new MyException("\nOption Invalid");

					}
				} else {
					i += 1;
					ls = 1;
					throw new MyException("\nCredentials Invalid or No Account found in DB");
				}
			} catch (MyException e) {
				System.out.println(e.getMessage());
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
