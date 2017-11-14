import java.util.Random;

public class Guess{

    //variables
    private int secretNum, guessNum;
    String tooHigh = "You guessed too high, sorry!";
    String tooLow = "You guessed too low, sorry!";
    String correct = "Congratulations, you guessed correctly";
    String message;

    

    
    //setter
    public void setGuessNum(int x){

	guessNum = x;
    }

    //getters
    public String getMessage(){

	return message;
    }

    public int getSecret(){

	return secretNum;
    }

    
    //process
    //generate a random number
    public void generateRandomNumber(){
	//this method gives from 0 to specified number( excluding it !)
	//so we just add 1 to result to get range from 1 - 20
	Random r = new Random();
	secretNum = r.nextInt(20) + 1;

    }

    
    
    //compare
    public void compare(){

	if(secretNum == guessNum){

	    message = correct;
	}
	else if(secretNum < guessNum){

	    message = tooHigh;
	}
	else{
	    message = tooLow;
	}

	System.out.println(message);
    }


    //output
    //message
}
