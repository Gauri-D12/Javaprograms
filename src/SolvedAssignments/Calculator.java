package SolvedAssignments;
import java.util.Scanner;

public class Calculator 
	{
    // Scanner object to read input
    static Scanner scanner = new Scanner(System.in);

    // Method to add two numbers
    public void add() {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Sum: " + result);
    }

    // Method to subtract two numbers
    public void sub() {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Difference: " + result);
    }

    // Method to multiply two numbers
    public void mul() {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Product: " + result);
    }

    // Method to divide two numbers
    public void div() {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Quotient: " + result);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        // Create object of Calculator class
        Calculator calculator = new Calculator();
        
        // Call the methods using the created object
        calculator.add();
        calculator.sub();
        calculator.mul();
        calculator.div();

        // Close the scanner
        scanner.close();
    }
}


