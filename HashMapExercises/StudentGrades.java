package HashMapExercises;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrades {

    private HashMap<String, List<Integer>> studentGrades;

    public StudentGrades() {
        this.studentGrades = new HashMap<>();
    }

    public void addStudentsAndCalifications(){
        Scanner scanner = new Scanner(System.in);
        String input;
        while(true){
            System.out.println("Enter a Student Name(Enter 'end' to finish): ");
            input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            String studentName = input;
            List<Integer> list = new ArrayList<>(); // create a new list for each student
            while (true) {
                System.out.println("Enter a  Student notes(Enter 'end' to finish): ");
                input = scanner.nextLine();
                if(input.equals("end")){
                   break;
                }
                try {
                    int note = Integer.parseInt(input);
                    list.add(note);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid entry. Please enter a valid number or 'end' to finish.");
                }
                this.studentGrades.put(studentName, list);
            }
        }
        System.out.println(this.studentGrades);
    }
    // Method to calculate the average grade for each student
    public void calculateAverageGrades() {
        //A Map.Entry is an interface that represents an entry (a key-value pair) in a Map.
        for (Map.Entry<String, List<Integer>> entry : this.studentGrades.entrySet()) { //entrySet() is a method that returns a set of all entries in the Map. Each entry is a key-value pair.
            String student = entry.getKey();//get key
            List<Integer> grades = entry.getValue();//get value

            double sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double average = sum / grades.size();

            System.out.println("The average grade for " + student + " is " + average);
        }
    }
}
