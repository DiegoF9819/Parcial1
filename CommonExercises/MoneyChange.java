package CommonExercises;

import java.util.Scanner;

public class MoneyChange {
    private Scanner scanner;
    private int option;
    private double quantity, result;
    private double dollarsRate; // Exchange rate from pesos to dollars
    private double eurosRate; // Exchange rate from pesos to euros
    private double poundsRate; // Exchange rate from pesos to pounds

    public MoneyChange() {
        this.scanner = new Scanner(System.in);
        this.dollarsRate = 0.00026;
        this.eurosRate = 0.00022;
        this.poundsRate = 0.00019;
    }

    public void conversion() {
        do {
            System.out.println("----- EXCHANGE RATE -----");
            System.out.println("1. Pesos cop to Dollars");
            System.out.println("2. Pesos cop to Euros");
            System.out.println("3. Pesos cop to Pounds Sterlings");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            this.option = scanner.nextInt();

            if (this.option >= 1 && this.option <= 3) {
                System.out.println("Please, Enter the amount of money:");
                this.quantity = scanner.nextDouble();
            } else {
                this.quantity = 0;
            }

            switch (this.option) {
                case 1:
                    this.result = this.quantity * this.dollarsRate;
                    System.out.println("The amount converted to dollars is: " + this.result);
                    break;
                case 2:
                    this.result = this.quantity * this.eurosRate;
                    System.out.println("The amount converted to euros is: " + this.result);
                    break;
                case 3:
                    this.result = this.quantity * this.poundsRate;
                    System.out.println("The amount converted to pounds is: " + this.result);
                    break;
                case 4:
                    System.out.println("leaving the program...");
                    break;
                default:
                    System.out.println("option wrong. please, select a valid option.");
            }
        } while (this.option != 4);
    }
}