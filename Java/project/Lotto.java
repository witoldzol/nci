import java.util.Random;

public class Lotto{

	//VARIABLES
	private int matched, prize, totalPrize;
    //arrays
    private int[] lottoNumbers = new int[6];
    private int[] firstSet = new int[6];
    private int[] secondSet = new int[6];
    private int[] thridSet = new int[6];
    private int[] results = new int[6];
    //constants
    final int THREE = 9;
    final int FOUR = 54;
    final int FIVE = 1000;
    final String SIX = "Won the lottery";


    //random generator obj
    Random rng = new Random();
	
    //generate random numbers array
    public void generateLotto(){

		for(int i = 0; i<6;i++){
		lottoNumbers[i] = rng.nextInt(40);
	        }
	    }
}
