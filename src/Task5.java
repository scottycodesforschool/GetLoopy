public class Task5 { // Class for Task 5

    public static void main(String[] args) {
        System.out.println("Increasing Triangle Figure");
        System.out.println("--------------------------");

        // Outer loop for rows (from 1 to 5)
        for (int i = 1; i <= 5; i++) {
            // Inner loop for stars in each row (prints 'i' stars)
            for (int j = 0; j < i; j++) {
                System.out.print("* "); // Print a star and a space
            }
            System.out.println(); // Move to the next line after each row is complete
        }
    }
}