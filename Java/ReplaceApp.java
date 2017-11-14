public class ReplaceApp{



    public static void main(String args[]){


	String name = "RudaKurwa";

	Replace rep = new Replace();

	rep.setName(name);

	rep.replace();

	System.out.println("new string is : " + rep.getNewName() );
	
    }



}
