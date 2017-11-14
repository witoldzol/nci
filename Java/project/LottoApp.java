import java.util.Random;
import java.util.Scanner;

public class LottoApp{

    public static void main(String[] args){

	//vars
	int[][] pickedNumbers = new int[3][6];
	String userInput, filteredUserInput;
	int temp;
	
	//prompt for numbers
	for(int i=0; i<3;i++){
	    queryForNumbers();
	}
	
	
    }
    //method for removing all non digit characters
    //in case user inputs incorrect characters
    //or tries to mess with our program
    public static String removeNonDigits(String x){
	//vars
	int len = x.length();
	String str;
	//obj-buffer
	StringBuffer sb = new StringBuffer();
	//loop through each char and test if it's a digit
	for(int i=0; i<len; i++){
	    if( Character.isDigit( x.charAt(i) ) ){
		//insert digit into buffer
		sb.append(x.charAt(i));
	    }
	    
	}
	//transform buffer to string after we are done with the loop
	str = sb.toString();
	return str;
    }

    public static String  queryForNumbers(){
	
	String userInput;
	//scanner
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please pick six numbers, from 1 to 10");
	    //filter user input and remove digits
	userInput = removeNonDigits(scan.nextLine());
	    //check if we have correct number of digits
	System.out.println("you selected: " + userInput);
	if(userInput.length() != 6){
	    queryForNumbers();
	}
	return userInput;
    }
}
