package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Declaring variables for items
		int numItems = scan.nextInt();
		HashMap<String,Number> itemPrices = new HashMap<>();
		
		// loop for item info
		for (int i = 0; i < numItems; i++) {
			itemPrices.put(scan.next(), scan.nextDouble());
		}
		
		// Declaring variables for customers
		int numCust = scan.nextInt();
		
		Customer[] customers = new Customer[numCust];
		
		// Loop for customer info
		for (int i = 0; i < numCust; i++) {
			String fname = scan.next();
			String lname = scan.next();
			Item[] items = new Item[scan.nextInt()];
			
			
			// Loop for each item bought by single customer
			for (int j = 0; j < items.length; j++) {
				int quantity = scan.nextInt();
				String nameItem = scan.next();
				
				items[j] = new Item(nameItem, (double) itemPrices.get(nameItem), quantity);
			}
			customers[i] = new Customer(fname, lname, items);
		}
		// Closing scanner
		scan.close();
		
		// Declaring display variables
		double highest = 0;
		Customer highestCustomer = null;
		double average = 0;
		double lowest = -1;
		Customer lowestCustomer = null;
		
		// Loop to find highest, lowest, and avg price
		for (Customer c : customers) {
			if (highest < c.getTotal()) {
				highestCustomer = c;
				highest = c.getTotal();
			}
			if (lowest > c.getTotal() || lowest < 0) {
				lowestCustomer = c;
				lowest = c.getTotal();
			}
			average += c.getTotal() / customers.length;
		}
		
		// Displaying info
		System.out.println("Biggest: " + highestCustomer.getFullname() + " (" + String.format("%.2f", highestCustomer.getTotal()) + ")");
		System.out.println("Smallest: " + lowestCustomer.getFullname() + " (" + String.format("%.2f", lowestCustomer.getTotal()) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
	}
}
