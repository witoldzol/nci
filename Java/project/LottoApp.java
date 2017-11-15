import java.util.Random;
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
	for(int i=0; i<1;i++){
	    //ask user for numbers
	    input = queryForNumbers(i);
	    //use input to insert it into our holding array
	    //	    insertInArray(i,pickedNumbers,userInput);
	    //	    System.out.println("line " + i + "is" + Arrays.deepToString(pickedNumbers));
	    System.out.println(Arrays.toString(input));
	}
	
	
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
    
    //method for removing all non digit characters
    //it will also check if numbers are valid (0-40)
    //
    public static String[] removeNonDigits(String x){
	//vars
	int counter = 0;
	String [] arr = new String[x.length()];
	String [] filteredArr = new String[6];
	//break string into array
	//this will remove all non numeric numbers at the same time
	arr = x.split("[^0-9]");
	//loop through each char and test if it's a digit
	for(int i=0; i<arr.length; i++){
	    if (arr[i] != ""){
		filteredArr[counter] = arr[i];
		counter++;
	    }
	}
	return filteredArr;
    }

    public static String[]  queryForNumbers(int x){
	//vars
	String[] userInput = new String[6];
	ArrayList<Integer> al = new ArrayList<Integern>();
	//scanner
	Scanner scan = new Scanner(System.in);
	
	System.out.println("please pick six numbers, from 1 to 40");
	    //filter user input and remove digits
	userInput = removeNonDigits(scan.nextLine());
	//test if user didn't enter invalid numbers outside permitted range
	test = testNumbers(userInput);
	//call the method again, if we didn't get 6 digits
	if(userInput.length != 6){
	    System.out.println("You must enter 6 digits, try again!");
	    queryForNumbers(x);
	}
	return userInput;
    }
    //method for testing numbers if they are correct
    public static ArrayList<Integer> testNumbers(String[] x){

	ArrayList al = new ArrayList();
	
	for(int i=0;i<x.length;i++){
	    //convert values to integers so we can test them
	    int y = Integer.parseInt(x[i]);
	    //if any value is out of range, add it to test al
	    if( y >40 || y<0){
		al.add(y);
	    }
	}
    }
    
}
