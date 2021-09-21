/*Write a program that reads in the radius and
length of a cylinder and computes the area and volume using the following formulas:
area = radius * radius * 
volume = area * length*/
// Q:2.2
// DEV HALVAWALA-20CS018

import java.util.Scanner;

public class Exercise01_2_2{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double pi = 3.1428;

        // input radius and length for cylinder
		System.out.println("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		// equation for area and volume of cylinder
		double area = radius * radius * pi;
		double volume = area * length;

		// area and volume of cylinder
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}