package SolvedAssignments;
import java.util.Scanner;
public class AgeCheckingbyInputs
{
    public static void main(String[] args)
    {
        // we will Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // here we enter the age
        System.out.print("Enter your age: ");

        // here we read the age input from the user
        int age = scanner.nextInt();

        // we check if age is greater than or equal to 18
        if (age >= 18) 
        {
            System.out.println("You are eligible to get driving licens");
        } else 
        {
            System.out.println("You are not eligible to get driving licens");
        }

       // scanner.close();
    }
}