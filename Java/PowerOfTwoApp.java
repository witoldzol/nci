import java.util.Scanner;

public class PowerOfTwoApp{


    public static void main(String args[]){
	//declare variables
	double number, res;

	
	Scanner input = new Scanner(System.in);

	//we create variable of type of PowerOfTwo
	PowerOfTwo myObj;

	//instantiate our object from the class we created previously
	myObj = new PowerOfTwo();

	System.out.println("Please give a number you wish to square");

	number = input.nextDouble();

	//we take input from the user and insert it into our setter

	myObj.setNum(number);

	//run our method that calculates the power of n

	myObj.power();

	//get the result

	res = myObj.getRes();

	//print the result
	System.out.println("result = " + res);
    }


}
