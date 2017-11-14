public class Name{

    //variables
    String name;
    char first, last;
    int len;
    int counter;
    //setters
    public void setName(String x){

	name = x;
    }
    //getters
    public String getName(){

	return name;
    }

    public int getCounter(){

	return counter;
	    }
    public int getLen(){
	len = name.length();
	return len;
    }
    //methods
    public char firstLetter(){

	return name.charAt(0);
    }

    public char lastLetter(){
	len = name.length();
	return name.charAt(len -1);
    }

    public void countA(){
	
	for(int i=0; i<name.length(); i++){

	    if(name.charAt(i) == 'a'){

		counter = counter + 1;
	    }
	}
    }
    
}
