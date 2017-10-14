public class PersonApp{

    public static void main(String args[]){

	//order in which we input args DOES MATTER - it corresponds to the
	//constructor that we set out in the instantiable class

	//also - because we specified our own constructor (ie. java will not give us default
	//constructor - so we have to populate the requred arguments - we cannot create
	//empty object anymore)
	Person me = new Person("jonny",10,false);

	Person me2 = new Person("dude");
	
	me.displayMe();

	me2.displayMe();
	
	Person me3 = new Person(true);

	me3.displayMe();

	Person me4 = new Person(10);

	
	me4.displayMe();
    }

}
