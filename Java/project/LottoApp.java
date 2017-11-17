import java.util.Scanner;

public class LottoApp {

	public static void main(String[] args) {

		while(true){

			Process obj = new Process();
			obj.game();
			if(!playAgain()){
				break;
			}
			//TODO
			//printResults();
		}

	}
	private static boolean playAgain(){

		Scanner scan = new Scanner(System.in);

		System.out.println("Would you like to play again? Type 'y' if you do");

		String answer = scan.next();

		if( answer.equals("y") ){
			System.out.println("you pressed yes");
			return true;
		} else{
			System.out.println("Thank you for playing, see you next time!");
			return false;
			//System.exit(0);
		}

	}
	//TODO
	private printResults(){
		
	}
}
class Process{

	public void game(){


		//variables
		int numberOfGames;
		int numbersProvided;

		//objects
		LottoInput inputObj = new LottoInput();

		inputObj.startGame();

		numberOfGames = inputObj.getInputHowManyGames();

		//loop until we get all the required lotto numbers
		while(true) {

			inputObj.askForNumbers();
			numbersProvided = inputObj.getHowManyLottoNumbersProvided();
			if(numberOfGames == numbersProvided){
				break;
			}
		}

		//instantiate object with values we generated previously
		Lotto processObj = new Lotto(

				inputObj.getFirstSet(),
				inputObj.getSecondSet(),
				inputObj.getThirdSet(),
				inputObj.getHowManyLottoNumbersProvided()
		);

		//generate random lotto numbers
		processObj.generateLotto();

		//calculate results
		processObj.getLottoResults();

		//save results

	}

}