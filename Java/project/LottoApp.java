

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

		while(true) {

			inputObj.askForNumbers();
			numbersProvided = inputObj.getHowManyLottoNumbersProvided();
			if(numberOfGames == numbersProvided){
				break;
			}
		}
	}
}
