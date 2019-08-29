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
		
		// Loop for customer info
		for (int i = 0; i < numCust; i++) {
			name[i] = scan.next() + " " + scan.next();
			numBought[i] = scan.nextInt();
			
			// Initialize customer item variables
			quantityC = new int[numBought[i]];
			nameItemsC = new String[numBought[i]];
			
			// Loop for each item bought by single customer
			for (int j = 0; j < numBought[i]; j++) {
				quantityC[j] = scan.nextInt();
				nameItemsC[j] = scan.next();
				
			}
		}
		
	}
}
