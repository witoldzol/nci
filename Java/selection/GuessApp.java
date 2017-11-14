import java.util.Scanner;
public class GuessApp{


    public static void main(String args[]){


	Guess obj = new Guess();

	obj.generateRandomNumber();

	Scanner scan = new Scanner(System.in);
	System.out.println("try a number");
	int nb = scan.nextInt();
	obj.setGuessNum(nb);
	obj.compare();
	
    }



}

