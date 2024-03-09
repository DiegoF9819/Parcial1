package VectorExercises;

import java.util.Vector;

public class VectorSum {
    private Vector<Integer> vector;

    // Constructor
    public VectorSum(Vector<Integer> vector) {
        this.vector = vector;
    }

    // Method for calculating the sum of the vector elements
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < this.vector.size(); i++) {
            sum += this.vector.get(i);
        }
        return sum;
    }
}
