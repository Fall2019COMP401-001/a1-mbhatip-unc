package a1;

import java.util.Objects;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Declaring variables for items
		int numItems = scan.nextInt();
		String[] nameItems = new String[numItems];
		double[] priceItems = new double[numItems];
		
		// loop for item info
		for (int i = 0; i < numItems; i++) {
			nameItems[i] = scan.next();
			priceItems[i] = scan.nextDouble();
		}
		
		// Declaring variables for customers
		int numCust = scan.nextInt();
		String[] name = new String[numCust];
		int numBought;
		int quantity; 
		String nameItem;
		double[] priceTotal = new double[numCust];
		
		// Loop for customer info
		for (int i = 0; i < numCust; i++) {
			name[i] = scan.next() + " " + scan.next();
			numBought = scan.nextInt();
			
			
			// Loop for each item bought by single customer
			for (int j = 0; j < numBought; j++) {
				quantity = scan.nextInt();
				nameItem = scan.next();
				
				// Loop to check which item was bought and add to total price
				for (int k = 0; k < numItems; k++) {
					if (Objects.equals(nameItem, nameItems[k])) {
						priceTotal[i] += quantity * priceItems[k];
						break;
					}
				}
			}
		}
		// Closing scanner
		scan.close();
		
		// Declaring display variables
		double highest = 0;
		String hname = null;
		double average = 0;
		double lowest = -1;
		String lname = null;
		
		// Loop to find highest, lowest, and avg price
		for (int i = 0; i < numCust; i++) {
			if (highest < priceTotal[i]) {
				highest = priceTotal[i];
				hname = name[i];
			}
			if (lowest > priceTotal[i] || lowest < 0) {
				lowest = priceTotal[i];
				lname = name[i];
			}
			average += priceTotal[i] / priceTotal.length;
		}
		
		// Displaying info
		System.out.println("Biggest: " + hname + " (" + String.format("%.2f", highest) + ")");
		System.out.println("Smallest: " + lname + " (" + String.format("%.2f", lowest) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
	}
}
