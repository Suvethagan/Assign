package Final;

public class ProductList {
	public static void showProducts() {
		String[][] product = new String[5][3];
		product[0][0] = "01";
		product[0][1] = "Mother Board";
		product[0][2] = "14000.00";

		product[1][0] = "02";
		product[1][1] = "DDR4 RAM";
		product[1][2] = "4000.00";

		product[2][0] = "03";
		product[2][1] = "VGA Card";
		product[2][2] = "2500.00";

		product[3][0] = "04";
		product[3][1] = "Wireless Mouse";
		product[3][2] = "1600.00";

		product[4][0] = "05";
		product[4][1] = "Laptop Charger";
		product[4][2] = "5000.00";

		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i][0] + " | " + product[i][1] + " | " + product[i][2] + " | " + product[i][3]
					+ " | " + product[i][4]);

		}
	}

	public class Summery {
		public void showSalesSummery() {
			String[][] sales = new String[5][3];
			sales[0][0] = "01";
			sales[0][1] = "Mother Board";
			sales[0][2] = "14000.00";

			sales[1][0] = "02";
			sales[1][1] = "DDR4 RAM";
			sales[1][2] = "4000.00";

			sales[2][0] = "03";
			sales[2][1] = "VGA Card";
			sales[2][2] = "2500.00";

			sales[3][0] = "04";
			sales[3][1] = "Wireless Mouse";
			sales[3][2] = "1600.00";

			sales[4][0] = "05";
			sales[4][1] = "Laptop Charger";
			sales[4][2] = "5000.00";

			for (int i = 0; i < sales.length; i++) {
				System.out.println(sales[i][0] + " | " + sales[i][1] + " | " + sales[i][2] + " | " + sales[i][3]
						+ " | " + sales[i][4]);

			}
		}
	}

	public void mainOption() {
		// TODO Auto-generated method stub
		
	}

	public void showSalesSummery() {
		// TODO Auto-generated method stub
		
	}
}
