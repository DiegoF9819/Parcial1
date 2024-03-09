package CommonExercises;

public class DigitSum {
    private int num;
    private int sum;

    // Constructor
    public DigitSum(int num) {
        this.num = num;
        this.sum = 0;
    }

    // Method to sum the digits
    public void sumDigits() {
        while (this.num > 0) {
            this.sum += this.num % 10;
            this.num /= 10;
        }
        System.out.println("The sum of the digits is: " + this.sum);
    }
}