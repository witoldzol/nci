public class Replace{

    //variables
    String name, newName;
    

    //setter
    public void setName(String x){

	this.name = x;
    }

    //getter
    public String getNewName(){

	return newName;
    }
    
    //replace 'a' with *
    public void replace(){

	//create buffor
	StringBuffer buf = new StringBuffer();
	
	for(int i=0; i<name.length();i++){

	    
	    if(name.charAt(i) == 'a'){

		buf.append('*');
	    }
	    else{

		buf.append(name.charAt(i));
	    }
	    
	}

	newName = buf.toString();
	
    }
}
