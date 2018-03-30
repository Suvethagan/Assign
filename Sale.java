package Final;

import java.util.Scanner;

public class Sale {
	static Scanner scan = new Scanner(System.in);

	public void Productlist() {
		// TODO Auto-generated method stub
		ProductList ds = new ProductList();
		ds.showProducts();
	}

	public void makeSale() {
		// TODO Auto-generated method stub
		System.out.println("Product Id : "); // if of the product
		String id = scan.nextLine();

		System.out.println("Number Of Products : ");// number of product
		int NumberOfProducts = scan.nextInt();

		System.out.println("Price : ");// price of the prouct
		double price = scan.nextDouble();
		
		System.out.println("                    ");
	}

}
