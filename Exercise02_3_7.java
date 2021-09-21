/*ComputeChange.java, to display the nonzero denominations only, using singular words for single units such
as 1 rupees and 1 paisa, and plural words for more than one unit such as 2 rupees and
3 paisas.*/
// Q:3.7
// DEV HALVAWALA-20CS018

import java.util.Scanner;

public class Exercise02_3_7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        // input total amount 
		System.out.println("Enter the amount :");
		double amount = input.nextDouble();

		int remainingAmount = (int)(amount * 100);
		
        // Find the number of rupees
		int numberOfOneRupees = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

        // Find the number of paisas in the remaining amount
		int numberOfPaisas = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;


		System.out.println("Your amount " + amount + " consists of \n" +"\t" + numberOfOneRupees + " rupees\n" +"\t" + numberOfPaisas + " paisas\n" );
	}

}
