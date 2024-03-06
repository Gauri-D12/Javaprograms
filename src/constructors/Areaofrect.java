package Assignments;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length of rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        // Input width of rectangle
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area
        double area = calculateRectangleArea(length, width);

        // Output the result
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}