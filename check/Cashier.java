package Final;

import java.util.Scanner;

public class Cashier {
	static Scanner scan = new Scanner(System.in);

	public static void mainScreen() {
		System.out.println("==========" + "\nPOS Menu" + "\n1.Add Product" + "\n2.Make Sale" + "\n3.Summery"
				+ "\n4.Add or Remove User" + "\n==========" + "\n\nSelect :");
		int select = scan.nextInt();
		option(select);
	}

	public static void option(int id) {
		// TODO Auto-generated method stub
		switch (id) {
		case 1:
			ProductList product = new ProductList();
			product.mainOption();
			break;
		case 2:
			Sale sale = new Sale();
			sale.Productlist();
			sale.makeSale();
			break;
		case 3:
			if (Admin.askLogin()) {
				Summery summery = new Summery();
				summery.showSaleSummery();
			} else {
				System.out.println("\nAccess Denied");
				mainScreen();
			}
			break;
		case 4:
			if (Admin.askLogin()) {
				User user = new User();
				user.mainOption();
			} else {
				System.out.println("\nAccess Denied");
				mainScreen();
			}
			break;
		default:
			System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		}

	}
}
