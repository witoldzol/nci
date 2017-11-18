public class Palidrome{

    //variables
    private String text;
    private boolean isPalidrome;
    
    //setter
    public void setText(String text){
	this.text = text;
    }
    //getter
    public boolean getAnswer(){
	return isPalidrome;
    }
    //METHODS
    public boolean  checkIfPalidrome(){

	int len = text.length();
	//cast type to int, which will round down
	int index = (int) len/2;
	int i = 0;
	boolean answer = recursion(index,i);
	
	return answer;
    }
    
    private boolean recursion(int index, int i){
	boolean answer = false;
	System.out.println("length: " + text.length());
	System.out.println("index" + index);
	System.out.println("i: " + i);
	System.out.println("answ: " + answer);
	if(index == 0 ){
	    answer = true;
	    return answer;
	}
	
	if(text.charAt(i) == text.charAt(text.length() -i -1)){

		recursion(index -1, i + 1);
	}

	else{
	    
	    answer = false;
	    return answer;
	}

	return answer;
	
    }
}
