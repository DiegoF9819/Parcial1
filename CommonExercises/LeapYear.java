package CommonExercises;

public class LeapYear {
    private int year;

    // Constructor
    public LeapYear(int year) {
        this.year = year;
    }

    // Method to calculate if the year is a leap year
    public void calculateLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a Leap Year");
        } else {
            System.out.println("It isn't a Leap Year");
        }
    }
}
