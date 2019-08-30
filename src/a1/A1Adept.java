package a1;

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
		int[] numBought = new int[numCust];
		int[] quantityC; 
		String[] nameItemsC;
		int[] priceTotal = new int[numCust];
		
		// Loop for customer info
		for (int i = 0; i < numCust; i++) {
			priceTotal[i] = 0;
			name[i] = scan.next() + " " + scan.next();
			numBought[i] = scan.nextInt();
			
			// Initialize customer item variables
			quantityC = new int[numBought[i]];
			nameItemsC = new String[numBought[i]];
			
			// Loop for each item bought by single customer
			for (int j = 0; j < numBought[i]; j++) {
				quantityC[j] = scan.nextInt();
				nameItemsC[j] = scan.next();
				
				// Loop to check which item was bought and add to total price
				for (int k = 0; k < numItems; k++) {
					if (nameItems[k] == nameItemsC[j]) {
						priceTotal[i] += quantityC[j] * priceItems[k];
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
			
			lowest = lowest < 0 ? priceTotal[i] : lowest;
			if (lowest > priceTotal[i]) {
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
