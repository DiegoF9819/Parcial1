package ListExercises;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    private ArrayList<Integer> list;
    private int i;

    // Constructor
    public RemoveDuplicates(ArrayList<Integer> list) {
        this.list = list;
    }

    // Method to remove duplicates from the list
    public ArrayList<Integer> removeDuplicates() {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(this.list);
        this.list.clear();
        this.list.addAll(hashSet);
        return this.list;
    }
}