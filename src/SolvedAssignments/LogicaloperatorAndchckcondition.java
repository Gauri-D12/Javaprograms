package SolvedAssignments;

public class LogicaloperatorAndchckcondition 
{

    public static void main(String[] args)
    	{
        	int number = 771;

        // Check if the number is positive and even
        		if (number > 0 && number % 2 == 0) 
        			{
        				System.out.println(number + " is a positive and even number.");
        			} 
        		else if (number > 0) 
        			{
        				System.out.println(number + " is a positive number but not even.");
        		} 
        		else
        			{
        				System.out.println(number + " is either negative or zero.");
        			}
    	}
}