/**
SmartNumberApp.java uses the instantiable class SmartNumber to determine the properties of a number entered by the user.

@author adriana e chis
*/

import java.util.Scanner;
public class SmartNumberApp {

	public static void main(String args[]) {
		// declare a variable to store the user's input
		int n;
		// declare a boolean variable to store the property of a number, i.e. either the number has that property or not
		boolean property, multipleOfFive, isOdd;

		Scanner myScanner = new Scanner(System.in); // declare and create an object of type Scanner to allow reading from the keyboard
		// prompt the user to input a number
		System.out.println("please enter an integer number:");
		n = myScanner.nextInt(); // read the number provided by the user

		SmartNumber number = new SmartNumber(); // create an object of type SmartNumber
		// call the method isNumberEven on the object number to find whether the value stored in the variable n is even
		property = number.isNumberEven(n);
		isOdd = number.isNumberOdd(n);
		multipleOfFive = number.isMultipleOfFive(n);
		


		System.out.println("is " + n + " even?: " + property + "\nis it odd?: " + isOdd + "\nis it multiple of 5?: " + multipleOfFive);
		
	}
}
