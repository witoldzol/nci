public class CalculatorApp{

    public static void main(String args[]){

	double n1;
	double n2;
	double result;

	//getters

	
	//declare variable of the object type
	SimpleCalculator calc;
	calc = new SimpleCalculator();

	calc.displayResult();

	//normally we would use Scanner to get input
	//we hardcode vals to save time
	n1 = 10;
	n2 = 7;
	
	//use setters
	calc.setNum1(n1);
	calc.setNum2(n2);
	calc.substract();
       	calc.displayResult();
	result = calc.getResult();

	System.out.println(result);
    }

}
