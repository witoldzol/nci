public class Person{

    //We use consrucors to initialize instance variables with meaningful values
    //if we didn't use constructor of our own, java will create a default one,
    //and populate instance variables with default values (0,false,"");


    
    //instance variables
    private String name;
    private int age;
    private boolean lovesToCode;

    //declare a CONSTRUCTOR
    //order of the args doesn't matter

    //because we specified the args, they will be REQUIRED when we call the constructor!
    public Person(String x, int y, boolean z){

	name = x;
	age = y;
	lovesToCode = z;
    }


    //we can have another constructor with the SAME NAME because the signature is different
    //----------
    //SIGNATURE IS: name + arguments specified!!!
    //----------
    public Person(String x){

	name = x;
    }

    public Person(boolean lovesToCode){

	//in this case this reference SHADOWS our instance variable
	//so we use this. notation

	// THIS. refers to the INSTANCE variable that we delared at the beginning
	this.lovesToCode = lovesToCode;
    }

    public Person(age){

	
	this.age = age;
	
	
    }
    
    public void displayMe(){

	System.out.println(name);
	System.out.println(age);
	System.out.println(lovesToCode);
	System.out.println();
    }

    
    
}
