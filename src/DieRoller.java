import java.util.Scanner; // For user input
import java.util.Random;  // For generating random numbers

public class DieRoller {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner for user input
        Random rand = new Random();      // Random number generator
        boolean playAgain = true;        // Controls the main game loop

        System.out.println("--- Welcome to the Die Roller! ---");
        System.out.println("Roll three dice until you get a triple!");

        // Main game loop: continues as long as the user wants to play again
        while (playAgain) {
            int rollCount = 0;       // Counter for the number of throws in a round
            int die1, die2, die3;    // Variables to store die values
            boolean gotTriple = false; // Flag to indicate if a triple has been rolled

            // Print the table header
            System.out.println("\nRoll           Die1          Die2          Die3          Sum");
            System.out.println("----------------------------------------------------------");

            // Loop to roll dice until a triple is achieved
            do {
                rollCount++; // Increment roll count for each throw
                die1 = rand.nextInt(6) + 1; // Roll die 1 (1-6)
                die2 = rand.nextInt(6) + 1; // Roll die 2 (1-6)
                die3 = rand.nextInt(6) + 1; // Roll die 3 (1-6)
                int sum = die1 + die2 + die3; // Calculate the sum of the dice

                // Print the current roll's details using printf for neat formatting
                // %-15d: Left-justified integer in a field of 15 characters
                // %-14d: Left-justified integer in a field of 14 characters
                // %-14d: Left-justified integer in a field of 14 characters
                // %-14d: Left-justified integer in a field of 14 characters
                // %d: Integer (sum)
                System.out.printf("%-15d%-14d%-14d%-14d%d%n", rollCount, die1, die2, die3, sum);

                // Check if it's a triple
                if (die1 == die2 && die2 == die3) {
                    gotTriple = true; // Set flag to true to exit the loop
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Triple " + die1 + "s! It took " + rollCount + " rolls to get a triple.");
                }

            } while (!gotTriple); // Continue rolling until a triple is found

            // Ask the user if they want to play again
            boolean validChoice = false;
            String userChoice;
            do {
                System.out.print("Play again? (y/n): ");
                userChoice = in.nextLine().trim().toLowerCase(); // Read, trim whitespace, and convert to lowercase

                if (userChoice.equals("y")) {
                    playAgain = true;
                    validChoice = true;
                } else if (userChoice.equals("n")) {
                    playAgain = false;
                    validChoice = true;
                } else {
                    System.out.println("Invalid input! Please enter 'y' for yes or 'n' for no.");
                }
            } while (!validChoice); // Loop until a valid 'y' or 'n' is entered
        }

        System.out.println("\nThanks for playing! Goodbye.");
        in.close(); // Close the scanner
    }
}