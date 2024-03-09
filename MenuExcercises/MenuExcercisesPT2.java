package MenuExcercises;

import CommonExercises.*;
import ListExercises.*;
import VectorExercises.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class MenuExcercisesPT2 {
    public void menuPT2(){
        int option;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("----- Exercises TestPT2 -----");
            System.out.println("1. Calculation, Greatest Common Divisor (GCM)");
            System.out.println("2. Calculating Repeated Digits in a Number");
            System.out.println("3. Sum of elements(VECTORS)");
            System.out.println("4. Product of even elements(VECTORS)");
            System.out.println("5. MaxElement(VECTORS)");
            System.out.println("6. RemoveDuplicates(LIST)");
            System.out.println("7. RemoveOdds(LIST)");
            System.out.println("8. Exit");
            System.out.print("<-Previous(9) ");
            System.out.println("(10)Next->");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    Mcd mcd = new Mcd(48, 18);
                    mcd.calculateMCD();
                    break;
                case 2:
                    CountDigit countDigit = new CountDigit(124431449, 4);
                    countDigit.calculate();
                    break;
                case 3:
                    Vector<Integer> vector = new Vector<>();
                    vector.add(1);
                    vector.add(2);
                    vector.add(3);
                    vector.add(4);
                    vector.add(5);
                    VectorSum vectorSum = new VectorSum(vector);
                    int sum = vectorSum.calculateSum();
                    System.out.println("The sum of the elements of the vector is: " + sum);
                    break;
                case 4:
                    Vector<Integer> vector2 = new Vector<>();
                    vector2.add(1);
                    vector2.add(2);
                    vector2.add(3);
                    vector2.add(4);
                    vector2.add(5);
                    vector2.add(6);
                    ProductOfEvenNumbers productCalculator = new ProductOfEvenNumbers(vector2);
                    int product = productCalculator.calculateProduct();
                    System.out.println("The product of the even numbers in the vector is: " + product);
                    break;
                case 5:
                    Vector<Integer> vector3 = new Vector<>();
                    vector3.add(1);
                    vector3.add(2);
                    vector3.add(24);
                    vector3.add(4);
                    vector3.add(5);
                    vector3.add(6);
                    MaxElement maxElement = new MaxElement(vector3);
                    int max = maxElement.findMax();
                    System.out.println("The maximum element in the vector is: " + max);
                    break;
                case 6:
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(1);
                    list.add(2);
                    list.add(2);
                    list.add(3);
                    list.add(3);
                    list.add(3);
                    RemoveDuplicates removeDuplicates = new RemoveDuplicates(list);
                    System.out.println("The list before removing duplicates: " + list);
                    ArrayList<Integer> result = removeDuplicates.removeDuplicates();
                    System.out.println("The list after removing duplicates: " + result);
                    break;
                case 7:
                    ArrayList<Integer> list2 = new ArrayList<>();
                    list2.add(1);
                    list2.add(2);
                    list2.add(3);
                    list2.add(4);
                    list2.add(5);
                    RemoveOdds removeOdds = new RemoveOdds(list2);
                    removeOdds.removeOddElements();
                    System.out.println("The list after removing odd elements: " + list2);
                    break;
                case 8:
                    System.out.println("Leaving the program...");
                    Main.exitProgram = true;
                    break;
                case 9:
                    MenuExcercisesPT1 menuExcercisesPT1 = new MenuExcercisesPT1();
                    menuExcercisesPT1.menuPT1();
                    break;
                case 10:
                    MenuExcercisesPT3 menuExcercisesPT3 = new MenuExcercisesPT3();
                    menuExcercisesPT3.menuPT3();
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option");
            }

        }while(option != 8 && !Main.exitProgram);
    }
}
