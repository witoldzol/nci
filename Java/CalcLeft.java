public class CalcLeft{


    double n1,n2;


    public void setN1(double x){

	n1 = x;

    }


    public void setN2(double x){

	n2 = x;
    }


    double result;

    
    public void displayResult(){

	System.out.println("result is : " + result);

    }

    public void leftover(){


	result = n1 % 12;
	
    }
    
}
