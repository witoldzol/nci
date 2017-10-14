//we need to import class before we use it
//tell compiler where the file is located
import java.util.Scanner;

public class InteractiveSquare{

    public static void main(String args[]){
	
	System.out.println("Please enter square side value:");
	
	int side;
	
	//create new Scanner object
	Scanner banana = new Scanner(System.in);

	side = banana.nextInt();

	int area = side * side;

	System.out.println(area);
    }
    
}
