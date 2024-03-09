package CommonExercises;

import java.util.Random;
import java.util.Scanner;

public class RandomSum {
    private int num1;
    private int num2;

    // Constructor
    public RandomSum() {
        Random rand = new Random();
        this.num1 = rand.nextInt(10) + 1; // Generates a random number between 1 and 10
        this.num2 = rand.nextInt(10) + 1; // Generates a random number between 1 and 10
    }

    // Method for calculating the sum and comparing with user input
    public void calculateAndCompareSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the sum of " + num1 + " and " + num2 + "?");
        int userSum = scanner.nextInt();
        int actualSum = num1 + num2;

        if (userSum == actualSum) {
            System.out.println("Correct! The sum of " + num1 + " and " + num2 + " is indeed " + actualSum + ".");
        } else {
            System.out.println("Incorrect. The sum of " + num1 + " and " + num2 + " is " + actualSum + ", not " + userSum + ".");
        }
        scanner.close();
    }
}
