package SolvedAssignments;
import java.util.Scanner;
public class AreaofCircle
{

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input radius of the circle
	        System.out.print("Enter radius of the circle: ");
	        double radius = scanner.nextDouble();

	        // Calculate area
	        double area = calculateCircleArea(radius);

	        // Output the result
	        System.out.println("The area of the circle is: " + area);

	        scanner.close();
	    }

	    // Method to calculate the area of a circle
	    public static double calculateCircleArea(double radius) {
	        return Math.PI * radius * radius;
	    }
	}
