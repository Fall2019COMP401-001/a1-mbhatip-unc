package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		
		// Getting input for total number of customers
		int numCustomer = scan.nextInt();
		
		// Declaring variables
		String[] fname = new String[numCustomer];
		String[] lname = new String[numCustomer];
		int numItem;
		double price;
		double[] total = new double[numCustomer];
		int quantity;
		String itemName;
		
		
		// Loop for each customer
		for (int i = 0; i < numCustomer; i++) {
			/* Getting Input:
			 * first name
			 * last name
			 * number of items bought
			 */
			fname[i] = scan.next();
			lname[i] = scan.next();
			numItem = scan.nextInt();
			
			// Getting quantity, name, and price for each item, calculating total
			for (int j = 0; j < numItem; j++) {
				quantity = scan.nextInt();
				itemName = scan.next();
				price = scan.nextDouble();
				total[i] += quantity * price;				
			}
		}
		// Closing scanner
		scan.close();
		
		// Printing output with loop
		for (int i = 0; i < numCustomer; i++) {
			System.out.println(fname[i].charAt(0) + ". " + lname[i]
					+ ": " + String.format("%.2f", total[i]));
		}
		
	}
}
