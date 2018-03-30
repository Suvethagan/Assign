package Final;

import java.util.Scanner;

public class Admin {
	public static boolean askLogin() {
		Scanner scan = new Scanner(System.in);
		String adminUsername = "admin";
		String adminPassword = "admin";
		System.out.println("Username for Admin :" + "\nPassword for Admin");
		String Adusername = scan.next();
		String Adpassword = scan.next();
		return validateLogin(Adusername, Adpassword);
	}

	public static boolean validateLogin(String adminUsername, String adminPassword) {
		// TODO Auto-generated method stub
		if (adminUsername.equals(adminUsername) && adminPassword.equals(adminPassword)) {
			System.out.println(".............." + "Logged In");
			return true;
		} else {
			System.out.println("Log In Failed");
			return false;
		}
	}
}
