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
    public void run(){

	int len = text.length();
	//cast type to int, which will round down
	int index = (int) len/2;
	int i = 0;
	
	isPalidrome = checkIfPalidrome(index,i);
	System.out.println("answer: " + isPalidrome);

    }

    //METHODS
    public boolean  checkIfPalidrome(int index, int i){



	System.out.println("length: " + text.length());
	System.out.println("index" + index);
	System.out.println("i: " + i);


	if(index == 0 ){

	    return true;
	}

	else if (text.charAt(i) == text.charAt(text.length() -i -1)) {

		checkIfPalidrome(index -1, i + 1);
	}

	else{
	    

	    return false;
	}
	System.out.println("ths is the end of function number " + i);
	return true;
    }	

}
