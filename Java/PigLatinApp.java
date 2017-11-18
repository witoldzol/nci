import java.util.Scanner;
public class PigLatinApp{


	public static void main(String[] args){

		String word;

		Scanner scan = new Scanner(System.in);

		System.out.println("give word to be translated: ");
		word = scan.nextLine();

		PigLatin obj = new PigLatin();

		obj.setText(word);

		obj.translateToPigLatin();

		System.out.println("Translated version: " + obj.getText());

	}

}