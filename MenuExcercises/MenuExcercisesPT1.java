package MenuExcercises;

import CommonExercises.*;

import java.util.Scanner;

public class MenuExcercisesPT1 {
    public void menuPT1(){
        int option;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("----- Exercises Test -----");
            System.out.println("1. Leap Year Verification");
            System.out.println("2. Rock, Paper, Scissors Game");
            System.out.println("3. MoneyChange");
            System.out.println("4. Compound Interest Calculation");
            System.out.println("5. Sum of Digits");
            System.out.println("6. Asterisk Pattern");
            System.out.println("7. Number Sort(without arrays)");
            System.out.println("8. Generation of Random Numbers with Sum");
            System.out.println("9. Exit");
            System.out.println("(10)Next->");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Enter a Year");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    LeapYear leapYear = new LeapYear(year);
                    leapYear.calculateLeapYear();
                    break;
                case 2:
                    ScissorsPaperRock scissorsPaperRock = new ScissorsPaperRock();
                    scissorsPaperRock.play();
                    break;
                case 3:
                    MoneyChange moneyChange = new MoneyChange();
                    moneyChange.conversion();
                    break;
                case 4:
                    CalculationCompoundInterest calculationCompoundInterest = new CalculationCompoundInterest();
                    calculationCompoundInterest.calculateInterest();
                    break;
                case 5:
                    System.out.println("Enter a Number example: 12, 24 or 54");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    DigitSum digitSum = new DigitSum(number);
                    digitSum.sumDigits();
                    break;
                case 6:
                    AsterikPatern asterikPatern = new AsterikPatern(4);
                    asterikPatern.printPattern();
                    break;
                case 7:
                    NumberSort numberSort = new NumberSort(9, 6, 2);
                    numberSort.sortNumbers();
                    break;
                case 8:
                    RandomSum randomSum = new RandomSum();
                    randomSum.calculateAndCompareSum();
                    break;
                case 9:
                    System.out.println("Leaving the program...");
                    Main.exitProgram = true;
                    break;
                case 10:
                    MenuExcercisesPT2 menuExcercisesPT2 = new MenuExcercisesPT2();
                    menuExcercisesPT2.menuPT2();
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option");
            }

        }while(option != 9 && !Main.exitProgram);
    }
}
