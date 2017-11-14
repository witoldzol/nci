import java.util.Scanner;

public class Left{




    public static void main (String args[]){

	double num;
	
	System.out.println("give number");

	Scanner scan = new Scanner(System.in);

	num = scan.nextDouble();


	CalcLeft calc = new CalcLeft();

	calc.setN1(num);

	calc.leftover();

	calc.displayResult();

	

    }
}
