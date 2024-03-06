package SolvedAssignments;

public class MultipleIfblock
{

    public static void main(String[] args)
    
    {
        int number = -106;
        if (number > 0)
        	{
        		System.out.println(number + " is a positive number.");
            
        			if (number % 2 != 0)
        				{
        					System.out.println(number + " is also an odd number.");
        				} 
        			else
        				{
        					System.out.println(number + " is an even number.");
        				}
        } 
        else if (number < 0) 
        	{
        		System.out.println(number + " is a negative number.");
        	} 
        else 	
        	{
        		System.out.println(number + " is zero.");
        }
    }
}