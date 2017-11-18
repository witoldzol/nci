public class StringSearch{

//variables
private int index;
private String string;
private char character;
boolean found;

//setters
public void setString(String string){
	this.string = string;
	}
public void setCharacter(char character){
	this.character = character;
	}
//getters
public int getIndex(){
	return index;
}
public boolean getFound(){
	return found;
	}

//methods


	public void searchString(){

			int len = string.length();

			for (int i = 0; i < len; i++){

				if(string.charAt(i) == character){
					index = i;
					found = true;
					break;
				}

			}

	}

}