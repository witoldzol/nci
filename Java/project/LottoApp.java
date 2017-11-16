

public class LottoApp {

	public static void main(String[] args) {
		//variables
		int numberOfGames;
		int numbersProvided;
		boolean err = false;
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
		System.out.println(inputObj.getFirstSet().toString()+"\n"+inputObj.getSecondSet().toString()+"\n"+inputObj.getThirdSet().toString());
	}
}
