/*(NumberFormatException) Listing 9.5, Calculator.java, is a simple commandline calculator. 
Note that the program terminates if any operand is nonnumeric.
Write a program with an exception handler that deals with nonnumeric
operands; then write another program without using an exception handler to
achieve the same objective. Your program should display a message that informs
the user of the wrong operand type before exiting (see Figure 14.12)*/

//20CS018 - DEV HALVAWALA

import java.util.Scanner;

public class Exercise14_01 {
    // Main method
    public static void main(String[] args){
        String num1;
        String num2;
        String operation;
        
        //Input of the first number
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        num1 = input.next();
        int i = Integer.parseInt(num1);

        //Input of second number
        System.out.println("Please enter second number");
        num2 = input.next();
        int j = Integer.parseInt(num2);
 
         
        // Check number of strings passed
        if (i != (int) i || j != (int) j ){
            System.out.println("wrong input");
            System.exit(0);
        }
        else{
 
            Scanner op = new Scanner(System.in);
            //Input for Arithmetic operation
            System.out.println("Please enter operation");
            operation = op.next();
 
            //Condition for addition and subtraction
            if (operation.equals("+")){
 
                System.out.println("your answer is " + (i + j));
            }
            if (operation.equals("-"))
            {
                System.out.println("your answer is " + (i - j));
            }
            
        }
    }
}
