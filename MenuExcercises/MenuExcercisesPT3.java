package MenuExcercises;

import CommonExercises.*;
import HashMapExercises.RemoveKeys;
import HashMapExercises.StudentGrades;

import java.util.Scanner;

public class MenuExcercisesPT3 {

    public void menuPT3() {
        int option;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("----- Exercises TestPT3 -----");
            System.out.println("1. Remove keys(HASHMAP)");
            System.out.println("2. Average of values(HASHMAP)");
            System.out.println("3. Exit");
            System.out.println("<-Previous(4)");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    RemoveKeys removeKeys = new RemoveKeys();
                    removeKeys.add();
                    removeKeys.removeKeysWithValueLessThan();
                    break;
                case 2:
                    StudentGrades studentGrades = new StudentGrades();
                    studentGrades.addStudentsAndCalifications();
                    studentGrades.calculateAverageGrades();
                    break;
                case 3:
                    System.out.println("Leaving the program...");
                    Main.exitProgram = true;
                    break;
                case 4:
                    MenuExcercisesPT2 menuExcercisesPT2 = new MenuExcercisesPT2();
                    menuExcercisesPT2.menuPT2();
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option");
            }

        }while(option != 3 && !Main.exitProgram);
    }
}
