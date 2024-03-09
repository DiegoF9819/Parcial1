package CommonExercises;

import java.util.Scanner;

public class CalculationCompoundInterest {
    private double quantity;
    private int option;
    private double interest, result;
    private Scanner scanner;

    // Constructor
    public CalculationCompoundInterest() {
        this.scanner = new Scanner(System.in);
    }

    // Method to calculate the compound interest
    public void calculateInterest() {
        System.out.print("Enter the amount to invest: ");
        this.quantity = scanner.nextDouble();

        do {
            System.out.println("----- INTEREST RATE -----");
            System.out.println("1. 5 years");
            System.out.println("2. 10 years");
            System.out.println("3. 15 years");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            this.option = scanner.nextInt();

            switch (this.option) {
                case 1:
                    this.interest = 9.05;
                    this.result = this.quantity * this.interest;
                    System.out.println("The amount earned over 5 years is: " + result);
                    break;
                case 2:
                    this.interest = 10.10;
                    this.result = this.quantity * this.interest;
                    System.out.println("The amount earned over 10 years is: " + result);
                    break;
                case 3:
                    this.interest = 15.05;
                    this.result = this.quantity * this.interest;
                    System.out.println("The amount earned over 15 years is: " + result);
                    break;
                case 4:
                    System.out.println("Leaving the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please, select a valid option.");
            }
        } while (this.option != 4);
    }
}
