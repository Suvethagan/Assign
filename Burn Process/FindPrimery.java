package bcas.csd;// the package where the codes located

import java.util.Scanner; // user input method 

public class FindPrimery { // main class
	public static void main(String[] args) { // main method
		boolean session = true; //
		while (session) { // it uses to iterate this part of program
			int num = 0;
			int i;
			int count = 0;
			Scanner scan = new Scanner(System.in);
			System.out.print("\n(!(!(!(!(!(!(!(!)!)!)!)!)!)!)!)" + "\n      Prime Number Checker"
					+ "\n(!(!(!(!(!(!(!(!)!)!)!)!)!)!)!)" + "\n\nEnter a Number :");// main display option
			num = scan.nextInt();
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("\nIt is a Prime Number");// if the number is primary the output will be "Prime
																// number"
			} else {
				System.out.println("\nIt is not a Prime Number");// if the number is not primary the output will be "not
																	// a Prime number"

			}
			System.out.println("\nDo you want to check another number? \nYes = Y or y \nNo = N or n");// selection of the option 
			String answer = "Y";
			answer = scan.next();// it allows users to enter their selections
			if (answer.equals("Y") || answer.equals("y")) {// when the user press Y / y the loop will run once more 
				System.out.println(" ");
			} else if (answer.equals("N") || answer.equals("n")) {
				System.out.println("Thank You !!!");//when the user press N / n the loop will be end
			}
		}
	}
}
