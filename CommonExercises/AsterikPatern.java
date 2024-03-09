package CommonExercises;

public class AsterikPatern {
    private int number;

    // Constructor
    public AsterikPatern(int number) {
        this.number = number;
    }

    // Method to print the asterisk pattern
    public void printPattern() {
        for (int i = 1; i <= this.number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

