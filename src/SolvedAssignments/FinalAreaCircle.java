package SolvedAssignments;

public class FinalAreaCircle 
{

    public static final double PI = 3.14159;

    // Method to calculate the area of a circle
    public static double calculateArea(double radius)
    {
        
        return PI * radius * radius;
    }

    public static void main(String[] args) 
    {
        double radius = 8.0; // Example radius
        
        
        double area = calculateArea(radius);
        
        
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}