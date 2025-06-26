public class Task6 { // Class for Task 6

    public static void main(String[] args) {
        System.out.println("Task 6: Downwards Triangle Figure");
        System.out.println("----------------------------------");

        // Outer loop for rows (from 5 down to 1)
        for (int i = 5; i >= 1; i--) {
            // Inner loop for stars in each row (prints 'i' stars)
            for (int j = 0; j < i; j++) {
                System.out.print("* "); // Print a star and a space
            }
            System.out.println(); // Move to the next line after each row is complete
        }
        System.out.println("\n"); //
    }
}