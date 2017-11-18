import java.util.Scanner;
public class Commission{

	public static void main(String[] args){

		final double BELOW_TWO = 0.02;
		final double OVER_TWO = 0.03;
		final double OVER_FOUR = 0.04;
		final double OVER_SIX = 0.08;

		double sales;
		double com = 0;

		Scanner scanObj = new Scanner(System.in);

		System.out.println("Please enter your weekly sales: ");
		sales = scanObj.nextDouble();

		if(sales <= 2000){
			com = sales * BELOW_TWO;
		}
		else if(sales > 2000 && sales <= 4000){
			com = sales * OVER_TWO;
		}
		else if(sales > 4000 && sales <= 6000){
			com = sales * OVER_FOUR;
		}
		else if(sales > 6000){
			com = sales * OVER_SIX;
		}

		System.out.println("Your commission is : EUR" + com);

		if(com >= 1500){
			System.out.println("Well done! You are one of our top sales employee!");
		}

	}


}