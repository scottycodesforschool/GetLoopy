public class Task4 { // New class for Task 4

    public static void main(String[] args) {
        System.out.println("Task 4: Count down by 2 from 10 to 0");
        System.out.println("------------------------------------");

        for (int i = 10; i >= 0; i -= 2) { // i -= 2 decrements by 2
            System.out.print(i + " ");
        }
        System.out.println("\n"); // Add a newline for better spacing
    }
}