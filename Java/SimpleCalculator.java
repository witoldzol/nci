public class SimpleCalculator{

    //declare data members
    //input
    private double num1;
    private double num2;
    //output
    private double result;
    
    //setters
    public void setNum1(double x){

	num1 = x;
    }
    
    public void setNum2(double x){

	num2 = x;
    }

    //getter
    public double getResult(){

	return result;
    }


    
    public void substract(){

	result = num1 - num2;
    } 

    public void displayResult(){

	System.out.println("first number = " + num1 + " ; second number = "+ num2 + " result = " +result);

    }

    
    
}
