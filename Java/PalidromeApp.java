import java.util.Scanner;
public class PalidromeApp{

    
    public static void main(String[] args){

	//variables
	String text;
	
	Scanner scan = new Scanner(System.in);

	System.out.println("insert string to be tested: ");
	text = scan.nextLine();

	Palidrome obj = new Palidrome();

	obj.setText(text);
	obj.run();
	
	if(obj.getAnswer()){
	    System.out.println("this word is a palidrome");
		} else {
	    System.out.println("this word is NOT a palidrome");
	}
	
    }


}
