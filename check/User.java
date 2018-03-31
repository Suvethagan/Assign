package Final;

import java.util.Scanner;

public class User {
	static Scanner scan = new Scanner(System.in);

	public void mainOption() {
		// TODO Auto-generated method stub
		System.out.println("Add User : ");
		int count = scan.nextInt();
		addUser(count);
	}

	private void addUser(int count) {
		// TODO Auto-generated method stub
		String[][] users = new String[count][8];

		for (int i = 0; i < count; i++) {
			System.out.println("ID : ");
			users[i][0] = scan.nextLine();

			System.out.println("Name : ");
			users[i][1] = scan.nextLine();
			System.out.println("                                 ");
		}
		System.out.println("\nUsers");
		for (int j = 0; j < count; j++) {
			System.out.println(users[j][0] + "|" + users[j][1] + "|" + users[j][2] + "|" + users[j][3]);
		}
		Cashier cashier = new Cashier();
		cashier.mainScreen();
	}

}
