import java.util.Scanner;

public class InteractiveCarpet {

    public static void main(String args[]){

	double length;
	double width;
	double area;
	double price;
	double totalPrice;
	
	System.out.println("Please specify length of carpet");

	//declare new object for taking in input
	Scanner	takeLength = new Scanner(System.in);
	
	//assign new object to variable and specify when we call it
	length = takeLength.nextDouble();
	
	System.out.println("Please specify width of carpet");

	Scanner takeWidth = new Scanner(System.in);

	width = takeWidth.nextDouble();
	
	System.out.println("Please specify price per meter");

	Scanner takePrice = new Scanner(System.in);

	price = takePrice.nextDouble();

	//you can just declare objects in one line - tested and works!
	//	double test;
	//	test = new Scanner(System.in).nextDouble();
	//	System.out.println ("one line rocks" + test);
	

	
	area = length * width;
	totalPrice = area * price;
	
	System.out.println("Total area is " + area + " square meters");

	System.out.println("Total price is " + totalPrice + " euro");
	
    }
}
