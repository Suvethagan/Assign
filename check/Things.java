package Final;

import java.util.Scanner;

public class Things {
	static Scanner scan = new Scanner(System.in);

	public static void mainOption() {
		System.out.println(" Add Things : ");
		int amountOfThings = scan.nextInt();
		addproduct(amountOfThings);
	}

	public static void addproduct(int productAmount) {
		// TODO Auto-generated method stub
		String[][] products = new String[productAmount][4];
		for (int i = 0; i < productAmount; i++) {
			System.out.println("\nProduct ID:" + "\nProduct Name :" + "\nNumber Of Product : " + "\nPrice :");
		products[i][0] = scan.nextLine(); 
		products[i][1] = scan.nextLine(); 
		products[i][2] = scan.nextLine(); 
		products[i][3] = scan.nextLine(); 
		}
		System.out.println("Summery");
		for(int j=0; j< productAmount;j++) {
			System.out.println(products[j][0]+"|"+products[j][1]+"|"+products[j][2]+"|"+products[j][3]);
		}
		Cashier cashier = new Cashier();
		cashier.mainScreen();
	}
}
