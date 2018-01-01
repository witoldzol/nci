import java.util.Scanner;
public class ArrayDemo{

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	int[] arr = new int[5];

	System.out.println("enter 5 numbers: ");
	

	
	for(int i = 0; i<6; ++i){
	    if(i == 5){
		break;
	    }
	    arr[i] = scan.nextInt();

	    
	}

	for(int j= 0; j<arr.length; j++){

	    System.out.println("Array element number " + j + " is equal to : " + arr[j]);
	    
	}
    }

}
