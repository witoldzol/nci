import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Testing {

    public static void main (String[] args) {

        ArrayList<Integer> myInts = new ArrayList<Integer>(25 );
        System.out.println(" Size of array list is = " + myInts.size() );

        myInts.add(1);
        myInts.add( 343);

        for (int i = 0; i < myInts.size(); i++) {

            System.out.println( myInts.get(i) + ", ");


        }

        if ( myInts.contains(1) ) {
            System.out.println( " 1 is in the array");
        }

        myInts.add( 2, 64);

        System.out.println( "343 is at index of : " + myInts.indexOf(343) ) ;

        // SORTING

        ArrayList<String> list = new ArrayList<String>();

        list.add( " one ");
        list.add( " two ");
        list.add( " three ");
        list.add( " four ");
        list.add( " five ");
        list.add( " siz ");


        System.out.println(" before sor, words = " + list.toString() );

        Collections.sort(list);

        System.out.println( " after sorting words are : " + list.toString() );


        // ITERATOR

        Iterator i;

        i = list.iterator();

        while ( i.hasNext() ) {

            System.out.println( "I like : " + i.next() );
        }


    }

}
