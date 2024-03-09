package CommonExercises;

public class CountDigit {
    private int number;
    private int digit;
    private int count = 0;

    // Constructor
    public CountDigit(int number, int digit) {
        this.number = number;
        this.digit = digit;
    }

    // Method to calculate the count of the digit in the number
    public void calculate() {
        while(this.number > 0) {
            if (this.number % 10 == this.digit) {
                this.count++;
            }
            this.number /= 10;
        }
        System.out.println("The digit " + this.digit + " appears " + this.count + " times in the number.");
    }
}

