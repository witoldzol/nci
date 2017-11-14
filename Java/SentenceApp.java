//problem 4
import java.util.Scanner;
public class SentenceApp{


    public static void main(String args[]){


	//vars
	String input;

	//scanner
	Scanner scan = new Scanner(System.in);

	System.out.println("give input: ");

	input = scan.nextLine();
	
	//obj
	Sentence obj = new Sentence();

	obj.setInput(input);

	obj.count();

	System.out.println("number of words is : " + obj.getWords());
	
    }

}
