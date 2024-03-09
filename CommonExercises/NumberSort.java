package CommonExercises;

public class NumberSort {
    private int num1;
    private int num2;
    private int num3;

    // Constructor
    public NumberSort(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    // Method to sort the numbers
    public void sortNumbers() {
        int temp;
        if (this.num1 > this.num2) {
            temp = this.num1;
            this.num1 = this.num2;
            this.num2 = temp;
        }

        if (this.num2 > this.num3) {
            temp = this.num2;
            this.num2 = this.num3;
            this.num3 = temp;
        }

        if (this.num1 > this.num2) {
            temp = this.num1;
            this.num1 = this.num2;
            this.num2 = temp;
        }

        System.out.println("The numbers in ascending order are: " + this.num1 + ", " + this.num2 + ", " + this.num3);
    }
}
