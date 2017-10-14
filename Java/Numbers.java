public class Numbers {

    public static void main(String args[]){

	int iNum1,iNum2, iRes;
	double dNum1, dNum2, dRes;

	iNum1 = 53;
	iNum2 = 33;

	dNum1 = 12;
	dNum2 = 5;

	// mixed addition - we use typecasting to add two variables of different type

	iRes = iNum1 + (int) dNum1; //type casting
	System.out.println(iRes);

	//double division
	dRes = dNum1 / dNum2;
	System.out.println(dRes);

	//integer division - will round down to the integer

	iRes = iNum1 / iNum2;
	System.out.println(iRes);

	// it will still treat it as a integer division, even if we store it in double
	dRes = iNum1 / iNum2;
	System.out.println(dRes);

	// it will work now 
	dRes = (double) iNum1 / iNum2;
	System.out.println(dRes);
	
	//same as above
	dRes =  iNum1 /(double) iNum2;
	System.out.println(dRes);

	//if we did that, it will first resolve brackets (round down) and then
	//it will type cast it to double (will add .0)
	dRes = (double) (iNum1 / iNum2);
	
	
	
	
    }
}
