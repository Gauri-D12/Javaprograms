package SolvedAssignments;
import java.util.Scanner;
public class CircleAreaScanner
	{
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the radius
	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();

	        // Calculate the area of the circle using the formula: area = π * radius * radius
	        double area = Math.PI * radius * radius;

	        // Print the area of the circle
	        System.out.println("The area of the circle with radius " + radius + " is: " + area);

	        // Close the scanner
	        scanner.close();
	    }
	}


