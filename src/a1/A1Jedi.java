package a1;

import java.util.Objects;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Same code from A1Adept used, some variables changed
		
		// Declaring variables for items
		int numItems = scan.nextInt();
		String[] nameItems = new String[numItems];
		double[] priceItems = new double[numItems];
		int[] countItems = new int[numItems];
		int[] numCustBought = new int[numItems];
		
		
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
						numCustBought[k] += 1;
						priceTotal[i] += quantity * priceItems[k];
						countItems[i] += quantity;
						break;
					}
				}
			}
		}
		// Closing scanner
		scan.close();
		
		// Displaying results with a loop to go through each item
		for (int i = 0; i < numItems; i++) {
			if (numCustBought[i] <= 0) {
				System.out.println("No customers bought " + nameItems[i]);
			}
			else {
				System.out.println(numCustBought[i] + " customers bought " + nameItems[i]);
			}
		}
	}
}
