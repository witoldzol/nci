//problem 4
public class Sentence{

    //variables
    String input;
    int words = 0;


    //setter
    public void setInput(String x){
	this.input = x;
    }
    //getter
    public int getWords(){
	return words;
    }

    //process
    public void calcLen(){
	
    }

    

    public void count(){
	for(int i=0; i<input.length(); i++){
	    if(i == 1){
		char curr = input.charAt(i);

		char prev = input.charAt(i-1);

		if(curr == ' ' && prev != ' '){
	    
		    words++;
		}
	    }
	}
    } 
}
