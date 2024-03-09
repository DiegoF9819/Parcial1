package HashMapExercises;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class RemoveKeys {
    Scanner scanner = new Scanner(System.in);

    //create new HasMaph to store key-value (Integer, string)
    private HashMap <Integer, String> map;
    //constructor
    public RemoveKeys() {
        this.map = new HashMap<>();
    }

    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter map elements (enter '-1' to finish):");
        int key;
        while(true){
            System.out.print("Key (Integer num): ");
            if(!scanner.hasNextInt()){
                System.out.println("Key must be a Integer Num.");
                scanner.nextLine(); // Consume invalid entry
                continue;
            }
            key = scanner.nextInt();
            scanner.nextLine();// Consume invalid entry
            if (key == -1) {
                break;
            }
            System.out.print("Value (String): ");
            String value = scanner.nextLine();
            this.map.put(key, value);
        }
        System.out.println("Map Entered: " + this.map);
    }

    public void removeKeysWithValueLessThan(){
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scann.nextInt();
        this.map.keySet().removeIf(key -> key < number);
        System.out.println("The Map Modified is: " + this.map);
    }
}
