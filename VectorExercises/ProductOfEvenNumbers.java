package VectorExercises;

import java.util.Vector;
public class ProductOfEvenNumbers {
    private Vector<Integer> vector;

    // Constructor
    public ProductOfEvenNumbers(Vector<Integer> vector) {
        this.vector = vector;
    }

    // Method for calculating the product of even numbers in vector
    public int calculateProduct() {
        int product = 1;
        for (int i = 0; i < this.vector.size(); i++) {
            if (this.vector.get(i) % 2 == 0) {
                product *= this.vector.get(i);
            }
        }
        return product;
    }
}