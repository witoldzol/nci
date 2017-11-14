/**
SmartNumber -- instantiable class to computes different properties of numbers.

@author adriana e chis
*/

public class SmartNumber {
	
	/* recall that if we do not declare a constructor with parameters within a class, we have the option to not declare any constructors at all because the java compiler adds the default constructor (i.e. the no-args constructor or the constructor with no parameters) if and only if we do not declare any constructors within a class */
	// declare a constructor without any parameters
	public SmartNumber() {
	}


	/** 
	    computes whether the number given/ passed in (i.e. via parameter number) is even. 
	    returns true if the number is even, otherwise returns false. 
	*/
    public boolean isNumberEven(int number) {
		// declare a variable to store whether the number is even
		boolean isEven = false;
		int remainder = number % 2;
		if (remainder == 0) {
			isEven = true;
		}
		return isEven;
	}

    
    //check if the value is odd
    public boolean isNumberOdd(int x) {

	boolean isOdd = false;
	int reminder = x % 2;
	if(reminder != 0){

	    isOdd = true;
	}
	return isOdd;
    }

    //check if multiple of five
    public boolean isMultipleOfFive(int x){

	boolean result = false;
	int reminder = x % 5;
	if(reminder == 0){

	    result = true;

	}
	
	return result;

    }

    
    
}
