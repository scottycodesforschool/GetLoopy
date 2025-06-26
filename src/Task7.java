public class Task7 { // Class for Task 7

    public static void main(String[] args) {
        System.out.println("Task 7: Square Figure (5x5)");
        System.out.println("---------------------------");

        // Outer loop for rows
        for (int i = 0; i < 5; i++) {
            // Inner loop for columns (stars in each row)
            for (int j = 0; j < 5; j++) {
                System.out.print("* "); // Print a star and a space
            }
            System.out.println(); // Move to the next line after each row is complete
        }
    }
}