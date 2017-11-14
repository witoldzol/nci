public class Reverse{

    //variables
    private String input, reversedInput;
    private int len;


    //setters
    public void setInput(String x){

	this.input = x;
    }

    //getter
    public String getReversed(){

	return reversedInput;
    }

    //object
    StringBuffer sb = new StringBuffer();
    
    //process
    public void calcLen(){

	len = input.length();
    }
    
    public void reverse(){

	
	for(int i=len-1; i>=0; i--){

	    char test = input.charAt(i);
	    
	    switch(test) {
	    case 'a' :
		sb.append(1);
		break;
	    case 'e' :
		sb.append(5);
		break;
	    case 'i' :
		sb.append(9);
		break;
	    case 'o' :
		sb.append(15);
		break;
	    case 'u' :
		sb.append(21);
		break;
	    default:
		sb.append(input.charAt(i));
		
	    }

	}

	reversedInput = sb.toString();
    }
    
}
