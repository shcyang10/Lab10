package co.grandcircus;

import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle r = new Circle();
		double inputNumber;
		String keepGoing = "n";

		System.out.println("Welcome to the Circle Tester");

		do {
			// System.out.println("Enter a radius: ");
			inputNumber = Validator.getDouble(scan, "Enter a radius: ");
			r.setRadius(inputNumber);
			System.out.println(r.getRadius());

			System.out.println(r.getFormattedCircumference());

			System.out.println(r.getFormattedArea());

			// System.out.println("Would you like to continue? (y/n): ");

			keepGoing = Validator.getString(scan, "Would you like to continue? (y/n): ");
			if (!keepGoing.equalsIgnoreCase("y")) {
				keepGoing = Validator.getString(scan, "Are you sure you don't want to continue? (y/n): ");
			}
		} while (keepGoing.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");

	}

}
