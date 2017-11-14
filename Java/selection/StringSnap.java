import java.util.Scanner;

public class StringSnap{

    public static void main(String args[]){

	String one, two;

	Scanner scan = new Scanner(System.in);

	System.out.println("write first string");

	//not nextString
	//ther is nextLine
	//next() by default is one word
	one = scan.next();

	System.out.println("write second string");

	two = scan.next();

	//WE HAVE TO USE EQUALS() TO COMPARE STRINGS (they are not primitive values!!)
	// == works only for primitives
	if( one.equals(two)){

	    System.out.println("SNAP KURWA");
	}


    }

}
