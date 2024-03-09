package CommonExercises;

public class Mcd {
    private int num1;
    private int num2;
    private int gcd;

    // Constructor
    public Mcd(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.gcd = 1;
    }

    // Method to calculate the greatest common divisor
    public void calculateMCD() {
        for(int i = 1; i <= this.num1 && i <= this.num2; ++i) {
            // Checks if i is factor of both integers
            if(this.num1 % i == 0 && this.num2 % i == 0)
                this.gcd = i;
        }

        System.out.println("The Greatest Common Divisor of " + this.num1 +" and " + this.num2 + " is " + this.gcd);
    }
}
