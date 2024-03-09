package CommonExercises;

import java.util.Scanner;
import java.util.Random;

public class ScissorsPaperRock {
    private String[] options;
    private Scanner scanner;
    private Random random;
    private String userPlay;

    // Constructor
    public ScissorsPaperRock() {
        this.options = new String[]{"rock", "paper", "scissors"};
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    // Method to play the game
    public void play() {
        System.out.println("Rock, paper or scissors");
        System.out.print("Enter your play, rock, paper or scissors:");
        this.userPlay = scanner.nextLine().toLowerCase();

        if(!this.userPlay.equals("rock") && !this.userPlay.equals("scissors") && !this.userPlay.equals("paper")) {
            System.out.print("Invalid input");
        } else {
            String pcPlay = options[random.nextInt(options.length)];

            if(this.userPlay.equals(pcPlay)) {
                System.out.println("It's a Tie");
            } else if (
                    this.userPlay.equals("rock") && pcPlay.equals("scissors") ||
                            this.userPlay.equals("paper") && pcPlay.equals("rock") ||
                            this.userPlay.equals("scissors") && pcPlay.equals("paper")) {
                System.out.println("You Win!");
            } else {
                System.out.println("PC Wins");
            }
        }
    }
}
