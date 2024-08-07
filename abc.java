import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
