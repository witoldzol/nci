import java.util.Scanner;
public class NameApp{


    public static void  main(String args[]){

	String nam;
	Scanner scan = new Scanner(System.in);

	System.out.println("Please provide the name  ");
	nam = scan.next();

	Name obj = new Name();

	obj.setName(nam);
	obj.countA();
	
	System.out.println("First char is : " + obj.firstLetter());
	System.out.println("Last char is : " + obj.lastLetter());
	System.out.println("Total number of characters is " + obj.getLen());
	System.out.println("There are " + obj.getCounter() );

    }
}
