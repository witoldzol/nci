import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class LottoInput{

	//Variables
	private String lottoNumbers;
	private int inputHowManyGames;
	private int howManyLottoNumbersProvided;

	//Objects
	Scanner scan = new Scanner(System.in);

	//setters

	//getters
	public String getLottoNumbers(){
		return lottoNumbers;
	}
	public int getInputHowManyGames(){
		return inputHowManyGames;
	}
	public int getHowManyLottoNumbersProvided(){
		return howManyLottoNumbersProvided;
	}

	//METHODS
	public void startGame(){

		System.out.println("Hi, welcome to LOTTO GAME. How many times you would like to play? (1-3)");

		while(true) {

			try {

				Scanner scan = new Scanner(System.in);
				inputHowManyGames = scan.nextInt();

				if(inputHowManyGames <=3 && inputHowManyGames >=1){
					System.out.println("Thank you.\n\nYou have 1 in 3,838,380 chance of winning this lottery. GOOD LUCK!\n");
					break;
				}else{
					System.out.println("Select value between 1 and 3. Try again");
				}

			} catch (Exception e) {

				System.out.println("Ooops, we have an error:\n" + e + "\nTry again");

			}
		}

	}
	public void askForNumbers(){

		System.out.println("Please enter 6 values between 1 and 40.");

		while(true){

			try{
				Scanner scan = new Scanner(System.in);

				lottoNumbers = scan.nextLine();

				int[] lottoNumbersArray = convertStringToArray(lottoNumbers);

				if(testNumbers(lottoNumbersArray)){
					break;
				}else{
					System.out.println("Try again");
				}

			}catch (Exception e){
				System.out.println("Ooops, we have an error:\n" + e + "\nTry again");
			}


		}

	}
	private int[] convertStringToArray(String inputString){

		int counter = 0;
		int filterCounter = 0;
		String[] stringArr = inputString.trim().split("\\s*[^0-9.]+");

		//count how many actual digits there are in array
		for (String ele : stringArr) {
			if (!ele.isEmpty()) {
				counter++;
			}
		}

		int[] filteredArr = new int [counter];

		for (String ele : stringArr) {
			if (!ele.isEmpty()) {
				filteredArr[filterCounter] = Integer.parseInt(ele);
				filterCounter++;
			}
		}

		return filteredArr;
	}

	private boolean testNumbers(int[] inputArray){

		int len = inputArray.length;

		System.out.println(Arrays.toString(inputArray));

		if(len <6){
			System.out.println("Not enough numbers provided");
			return false;
		}else if(len > 6) {
			System.out.println("Too many numbers provided");
			return false;
		}

		if(testForDuplicates(inputArray)){
			System.out.println("Ahhh Geez, you cannot select same number more than once");
			return false;
		}

		if(testForValidNumbers(inputArray)){
			System.out.println("Oh dear, you selected number(s) outside of valid range.\nPick numbers between 1 and 40.");
			return false;
		}
		return true;
	}

	private boolean testForDuplicates(int[] arr){

		for(int i =0; i<arr.length; i++){

			int counter = 0;

			for(int j = 0; j<arr.length; j++){

				if(arr[i] == arr[j]){

					counter++;

					if(counter == 2){
						return true;
					}
				}
			}
		}
		return false;
	}
	private boolean testForValidNumbers(int[] arr){

		for(int ele : arr){
			if(ele > 40 || ele <1 ){
				return true;
			}
		}
		return false;
	}
}
