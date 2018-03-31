package Final;

import java.util.Scanner;

public class UserLogIn {
	public static void Login() {
		Scanner scan = new Scanner(System.in);
		String Username = "csd";
		String Password = "0000";
		System.out.println("\nUsername : " + "\nPassword : ");
		String username = scan.next();
		String password = scan.next();
		check(username, password);
	}

	public static void check(String username, String password) {
		// TODO Auto-generated method stub
		boolean isVlaid = (boolean) validateLogin(username,password);
		if(isVlaid) {
			Cashier cashier = new Cashier();
			cashier.mainScreen();
		}
		else {
			Login();
		}
	}

	public static Object validateLogin(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equals("csd")&&password.equals("0000")) {
			System.out.println("Logged In Success");
			return true;
		}
	
	else {
		System.out.println("Log In Faild");
	}
		return false;


	}
}