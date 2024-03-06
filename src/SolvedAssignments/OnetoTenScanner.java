package SolvedAssignments;

import java.util.Scanner;

public class OnetoTenScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the starting and ending values
        System.out.print("Enter the starting value: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending value: ");
        int end = scanner.nextInt();

        // Print values from start to end using a for loop
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}