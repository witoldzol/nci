public class Blood{

    //variables
    private String bloodType;
    private int age;
    boolean notOldEnough = false;
    

    //setters
    public void setBloodType(String x){

	bloodType = x;
    }

    public void setAge(int x){

	//check if old enough
	if(x < 18){

	    notOldEnough = true;
	}
	age = x;
	
    }

    public void canGiveTo(){

	switch(bloodType) {

	    

	}
	

    }
    
}
