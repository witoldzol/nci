import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class LottoApp{

    public static void main(String[] args){

		//vars
		int[][] pickedNumbers = new int[3][6];
		String[] input, filteredUserInput;
		int temp;

		//prompt for numbers
		for(int i=0; i<1; i++){
			//ask user for numbers
			input = queryForNumbers();
			//use input to insert it into our holding array
			//insertInArray(i,pickedNumbers,userInput);
			//System.out.println("line " + i + "is" + Arrays.deepToString(pickedNumbers));
			System.out.println(Arrays.toString(input));
		}


    }

	public static String[] queryForNumbers(){
		//vars
		String[] userInput;
		int[] intArray;
		boolean test;
		//scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("please pick six numbers, from 1 to 40");


		//filter user input and remove digits
		userInput = removeNonDigits(scan.nextLine());
		
		if(userInput.length < 6){
			System.out.println("You didn't pick enough numbers, try again");
			queryForNumbers();
		} else if (userInput.length > 6){
			System.out.println("You picked too many numbers, try again");
			queryForNumbers();
		}
		//tranform from String to int array
		intArray = stringToIntegerArray(userInput);

		//test if user didn't enter invalid numbers outside permitted range
		test = testNumbers(intArray);

		if(!test){
			System.out.println("You selected number(s) outside of valid range. Try again");
			queryForNumbers();
		}

		return userInput;
	}


    //method for removing all non digit characters
    //it will also check if numbers are valid (0-40)
    //
    public static String[] removeNonDigits(String x){
		//vars
	        //use it to count how many actual digits we have
	        //so we know at what size declare our filteredArray
		int counter = 0;
			//we will use it to increment index when inserting
	        //elements into filteredArray
		int secondCounter =0;
		String [] arr;

		//break string into array
		//this will remove all non numeric numbers at the same time
		arr = x.trim().split("\\s*[^0-9.]+");

		//iterate over array and remove all whitespaces
		for(int i = 0; i<arr.length; i++){
			arr[i] = arr[i].trim();
		}
		//count how many actual digits there are in array
	    for (String ele : arr) {
		    if (!ele.isEmpty()) {
			    counter++;
		    }
	    }

		//now that we know how many digits are in the string
	    //we can declare array for actual numbers
	    String [] filteredArr = new String[counter];

	    //loop through each char and test if it's a digit
	    for(int i=0; i<arr.length; i++){
			if (!arr[i].isEmpty()){
				filteredArr[secondCounter] = arr[i];
				secondCounter++;
			}
		}


		return filteredArr;
    }

	//change String[] to int[]
	public static int[] stringToIntegerArray(String[] x){
    	int[] arr = new int[x.length];

    	for(int i = 0; i<x.length; i++){

    	    arr[i] = Integer.parseInt(x[i]);
	    }
	    return arr;
	}

    //method for testing numbers if they are within range
    public static boolean testNumbers(int[] x){

		for(int i=0;i<x.length;i++){

			//if any value is out of range
			if( x[i] > 40 || x[i] == 0 ){

				return false;
			}
		}
		return true;
    }
	public static boolean duplicateCheck(int [] x){

    	boolean y = true;

		return y;
	}
     /*
    //method for inserting digits into array
    public static int[][] insertInArray(int x, int[][] y, String userInput){
	//var

	//loop
	for(int i=0;i<userInput.length();i++){
	    // because charAt() gives as unicode values
	    //by substracting result with '0' we convert them to
	    //standard didgits
	    y[x][i] = userInput.charAt(i) - '0';
	}

	return y;
    }
    */
}
