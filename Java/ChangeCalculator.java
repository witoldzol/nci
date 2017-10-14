import java.util.Scanner;

public class ChangeCalculator {

    public static void main(String args[]){

	int totalPrice, amtReceived, change;

	System.out.println("Please type the total price of products");

	totalPrice = new Scanner(System.in).nextInt();

	System.out.println("Please insert how much customer has given us");

	amtReceived = new Scanner(System.in).nextInt();

	change = amtReceived - totalPrice;

	final int NOTE50 = 50;
	final int NOTE20 = 20;
	final int NOTE10 = 10;
	final int NOTE5 = 5;
	final int COIN2 = 2;
	final int COIN1 = 1;
	
	
	int change50 = change / NOTE50;

	int remainingChange;

	remainingChange = change - (NOTE50*Change50);

	int change20 = remainingChange / NOTE20;

	remainingChange = remainingChange - NOTE20*change20;
	
	int change10 = remainingChange /NOTE10;

	remainingChange = remainingChange - NOTE10*change10;

	int change5= remainingChange / NOTE5;

	remainingChange = remainingChange - NOTE5*change5;

	int change2 = remainingChange / COIN2;

	remainingChange = remainingChange - COIN2*change2;

	int change1 = remainingChange / COIN1;

	System.out.println("Customer will get back: " + change50 + "  50 euro notes");

	System.out.println("Customer will get back: " + change20 + "  20 euro notes");

	System.out.println("Customer will get back: " + change10 + "  10 euro notes");

	System.out.println("Customer will get back: " + change5 + "  5 euro notes");

	System.out.println("Customer will get back: " + change2 + "  2 euro coins");

	System.out.println("Customer will get back: " + change1 + "  1 euro coins"); 	

	System.out.println("Total change given back is : " + change);
	
	
	
    }
}
