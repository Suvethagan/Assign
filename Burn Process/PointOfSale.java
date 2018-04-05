/*ADMIN
 *USER NAME = bcas
 *PASSWORD = 1111
 *
 *CASHIER
 *USER NAME = csd
 *PASSWORD = 0000*/
package bcas.csd; // package name

import java.util.Scanner; // user input import method

public class PointOfSale {// class name
	public static String admin[] = { "0", "bcas", "1111" }; // admin username and password
	public static String cashier[] = { "101", "csd", "0000" };// cashier username and password
	public static String cashier0[][] = new String[100][3];
	public static String customerDailyDetail[][] = new String[100][6];
	public static int cachierNo = 1;
	public static int cashierNo = 0;
	public static int customerNo = 0;
	public static Scanner scan = new Scanner(System.in);
	
// login option how a user can acces the program and it guide them to use the program efficiently 
	public static void login() {
		String position;
		String username, password;
		System.out.print("\n	How do you want to log in?" + "\n\n1.Admin -> " + "Press 0" + "\n2.Cashier -> "
				+ "Press 1" + "\n\nEnter your chiose :");
		position = scan.next();
		System.out.print("User Name : ");
		username = scan.next();
		System.out.print("Pass Word : ");
		password = scan.next();

		if (admin[0].equals(position) && admin[1].equals(username) && admin[2].equals(password)) {
			System.out.println("Logged In Successfuly");
			System.out.println(" ");
			adminAccount();
		} else if (position.equals("1") && cashier[1].equals(username) && cashier[2].equals(password)) {
			System.out.println("corect !!!");
			System.out.println(" ");
			System.out.println(" ");
			cashierAccount(username);
		} else if (position.equals("1") && cashierNo != 101) {
			int r = 0;
			for (int i = 0; i < cashierNo; i++) {
				if (cashier0[i][1].equals(username) && cashier0[i][2].equals(password)) {
					r = 1;
				}
			}
			if (r == 1) {
				System.out.println("Logged In Sucessfully");
				cashierAccount(username);
			} else {
				System.out.println("Pass Word or User Name Incorect !!!" + "\nTry Again");
			}
		} else {
			System.out.println("Pass Word or User Name Incorect !!!" + "\nTry Again");
		}
		System.out.println(" ");
		login();
	}
// what a admin account can do 
	public static void adminAccount() {
		int wan = 0;
		System.out.println("\n");
		System.out.println("What do you want to do?" + "\n\n1.Today Sales Details 	-> 1" + "\n2.Add User 		-> 2"
				+ "\n\nEnter : ");
		wan = scan.nextInt();
		System.out.println("");
		if (wan == 1) {
			showDetailes();
		} else if (wan == 2) {
			createcashier();
		}

		System.out.println("Do you want logout ?(Yes = y // No = n)");
		yn2();
	}
// to do another sales of user adding or sales summery it ask permission
	public static void yn2() {
		String answer = "y";
		answer = scan.next();
		if (answer.equals("n") || answer.equals("N")) {
			adminAccount();
		} else if (answer.equals("y") || answer.equals("Y")) {
			System.out.println("                                 Thanks for coming");
		} else {
			System.out.println("Enter only ?(Yes = y // No = n)");
			yn2();
		}
	}
// to create a new user account
	public static void createcashier() {
		String un, pw, pw1;
		System.out.println("Current Detailes");

		System.out.print("Enter  UserName   :");
		un = scan.next();
		System.out.print("Enter PassWord   :");
		pw = scan.next();
		if (pw.equals(pw)) {
			cashier0[cashierNo][0] = String.valueOf(cashierNo);
			cashier0[cashierNo][1] = un;
			cashier0[cashierNo][2] = pw;
			cashierNo++;
		} else {

		}
		System.out.println("Do you want create another account ?(Yes = y // No = n)");
		yn();
		System.out.println(" ");
	}
// when the administrator creates a new user this part of prgrma allows them to save the account
	public static void yn() {
		String answer = "y";
		answer = scan.next();
		if (answer.equals("n") || answer.equals("N")) {
			System.out.println("Save create account");
		} else if (answer.equals("y") || answer.equals("Y")) {
			createcashier();
		} else {
			System.out.println("Enter only ?(Yes = y // No = n)");
			yn();
		}
	}
// it allows administrator to check the daily sales statements
	public static void showDetailes() {
		System.out.println("Details of Today Sales");
		for (int i = 0; i < customerNo; i++) {
			System.out.println("Coustermer No   :  " + (i + 1));
			System.out.println(" ");
			System.out.println("Product :" + customerDailyDetail[i][0] + "\nQuantity(product wice)  :"
					+ customerDailyDetail[i][1] + "\nTotal Prize             :" + customerDailyDetail[i][2]
					+ "\nAmount Pay              :" + customerDailyDetail[i][3] + "\nBalance                 :"
					+ customerDailyDetail[i][4] + "\nCashier Name            :" + customerDailyDetail[i][5]);
			System.out.println(" ");
		}

		System.out.println(" ");

	}
// function of cashier menu it allows cashier to make slaes calulate balance 
	public static void cashierAccount(String username) {
		double amountPay = 0.0;
		double Balance = 0.0;
		int Quantity = 1, TotalPrize = 0, p;
		int prize[] = new int[100];
		String quantity[] = new String[100];
		int quantityNo = 0;
		String Quantity0 = "";
		System.out.println("Saling the Product");
		System.out.println("Finishing the sales then enter '0' ");
		for (int i = 0; i < 100; i++) {
			System.out.print("Enter Product Name:");
			quantity[i] = scan.next();
			if (quantity[i].equals("0")) {
				for (int j = 0; j < i; j++) {
					TotalPrize += prize[j];
				}
				System.out.println(" ");
				System.out.println("Total purchers Prize:" + TotalPrize);
				break;
			}
			System.out.print("Quantity          :");
			Quantity = scan.nextInt();
			System.out.print("Prize             :");
			p = scan.nextInt();
			prize[i] = p * Quantity;
			quantityNo = i;
			Quantity0 = Quantity0.concat(Quantity + ",");
		}
		System.out.print("Enter Amount Pay:");
		amountPay = scan.nextInt();
		Balance = amountPay - TotalPrize;
		System.out.println("Balance Pay:" + Balance);
		System.out.println(" ");
		customerDailyDetail[customerNo][0] = "";
		for (int i = 0; i < quantityNo + 1; i++) {
			customerDailyDetail[customerNo][0] = customerDailyDetail[customerNo][0].concat(quantity[i] + ",");
		}
		customerDailyDetail[customerNo][1] = String.valueOf(Quantity0);
		customerDailyDetail[customerNo][2] = String.valueOf(TotalPrize);
		customerDailyDetail[customerNo][3] = String.valueOf(amountPay);
		customerDailyDetail[customerNo][4] = String.valueOf(Balance);
		customerDailyDetail[customerNo][5] = username;

		customerNo++;
		System.out.println(" Thank You for sales");

		System.out.println("Do you want logout ?(Yes = y // No = n)");
		yn1(username);

	}
// to run the loop the user has to select the selection Y or No
	public static void yn1(String username) {
		String answer = "y";
		answer = scan.next();
		if (answer.equals("n") || answer.equals("N")) {
			cashierAccount(username);
		} else if (answer.equals("y") || answer.equals("Y")) {
			System.out.println("                                 Thanks for coming");
		} else {
			System.out.println("Enter only ?(Yes = y // No = n)");
			yn1(username);
		}
	}
// main menu print screen
	public static void main(String[] args) {
		System.out.println("\n          ================================" + "\n		Point Of Sale System"
				+ "\n          ================================");
		login();
	}
}
