import java.util.Scanner;

public class ReverseApp{


    public static void main(String args[]){

	//variables
	String input;

	//object
	Scanner scan = new Scanner(System.in);

	System.out.println("Please insert string you want to reverse");

	//next() will get the whole word
	input = scan.nextLine();

	Reverse obj = new Reverse();

	obj.setInput(input);
	
	obj.calcLen();

	obj.reverse();

	System.out.println("Answer:  " + obj.getReversed());
	
    }

}
