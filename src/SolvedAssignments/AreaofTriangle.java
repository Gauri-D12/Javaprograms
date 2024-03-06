package SolvedAssignments;

public class AreaofTriangle
{

    public static void main(String[] args)
    {
        double b = 10.0; // Base of the triangle
        double h = 10.0; // Height of the triangle

        // formula: A = (base * height) / 2
        double area = (b * h) / 2.0;

        // for print of the triangle
        System.out.println("The area of the triangle with base " + b + " and height " + h + " area of triangle is: " + area);
    }
}