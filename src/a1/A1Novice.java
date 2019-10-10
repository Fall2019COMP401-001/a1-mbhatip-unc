package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Getting input for total number of customers
		int numCustomer = scan.nextInt();
		Customer[] customers = new Customer[numCustomer];
		// Loop for each customer
		for (int i = 0; i < numCustomer; i++) {
			String fname = scan.next();
			String lname = scan.next();
			int numItem = scan.nextInt();
			Item[] items = new Item[numItem];
			
			// Getting quantity, name, and price for each item, calculating total
			for (int j = 0; j < numItem; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				items[j] = new Item(itemName, price, quantity);
			}
			customers[i] = new Customer(fname, lname, items);
		}
		// Closing scanner
		scan.close();
		
		// Printing output with loop
		for (Customer c : customers) {
			double total = 0.0;
			for (Item i : c.getItems()) {
				total += i.getTotal();
			}
			System.out.println(c.getFirstname().charAt(0) + ". " + c.getLastname()
					+ ": " + String.format("%.2f", total));
		}
		
	}
}
