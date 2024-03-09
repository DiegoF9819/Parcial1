package VectorExercises;

import java.util.Vector;
public class MaxElement {
    private Vector<Integer> vector;

    // Constructor
    public MaxElement(Vector<Integer> vector) {
        this.vector = vector;
    }

    // Method to find the maximum element in the vector
    public int findMax() {
        int max = this.vector.get(0);
        for (int i = 1; i < this.vector.size(); i++) {
            if (this.vector.get(i) > max) {
                max = this.vector.get(i);
            }
        }
        return max;
    }
}
