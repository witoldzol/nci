public class PowerOfTwo{

    private double num, result;
    
    //setter
    public void setNum(double x){

	num = x;
    }
    
    //getter - we HAVE TO SPECIFY TYPE OF RETURNED VALUE !!!!
    public double getRes(){

	return result;
    }
    //calculate output
    public void power(){

	result = num * num;

    }

    
}
