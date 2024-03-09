package ListExercises;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveOdds {
    private ArrayList<Integer> list;

    // Constructor
    public RemoveOdds(ArrayList<Integer> list) {
        this.list = list;
    }

    // Method to remove odd elements from the list
    public void removeOddElements() {
        /*
            an Iterator object named itr is created from the list this.list.
            The Iterator is an interface in Java that provides methods to iterate
            over any type of collection.
         */
        Iterator<Integer> itr = this.list.iterator();
        /*
            hasNext() is a method of the Iterator interface that returns
             true if the iteration has more elements.
         */
        while (itr.hasNext()) {
            //System.out.println(itr.hasNext());
            /*
                Within the loop, itr.next() retrieves the next element in the iteration.
                This element is stored in the variable number.
             */
            Integer number = itr.next();
            if (number % 2 != 0) {
                itr.remove();
            }
        }
    }
}
