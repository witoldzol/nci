import java.util.Scanner;
public class SearchStringApp{

	public static void main(String[] args){

		//variables
		String string;
		char character;

		Scanner scan = new Scanner(System.in);
		StringSearch search = new StringSearch();

		System.out.println("Please enter the string : ");

		string = scan.nextLine();
		search.setString(string);

		System.out.println("Please enter the character you want to look for : ");
		character = scan.next().charAt(0);
		search.setCharacter(character);

		search.searchString();

		boolean test = search.getFound();

		if(test){
			System.out.println("This character was found at index: " + search.getIndex());
		} else {
			System.out.println("This character wasn't found in this string");
		}

	}

}