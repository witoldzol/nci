import java.util.Scanner;

public class CircleArea{

    public static void main(String args[]){

	System.out.println("Please state circle radious ");
	
	double radius = new Scanner(System.in).nextDouble();

	final double pi = 3.14;
	
	System.out.println("Area of the circle is " + pi*radius*radius);

	
    }

}
