package SolvedAssignments;

public class CheckNumDivisibleorNot
{

	   public static void main(String[] args)
	   {
	         for (int i = 1; i <= 500; i++)
	         	{
	        	 	// Check if the number is divisible by 3 and 5
	            if (i % 3 == 0 && i % 5 == 0)
	            {
	                System.out.println(i+  "  Computer & Mouser");
	            } 
	            	// Check if the number is divisible by 3
	            else if (i % 3 == 0)
	            {
	                System.out.println(i+  "  Computer");
	            } 
	            	// Check if the number is divisible by 5
	            else if (i % 5 == 0) 
	            {
	                System.out.println(i+  "  Mouser");
	            } 
	            	// If the number is not divisible by either 3 or 5
	            else 
	            {
	                System.out.println(i);
	            }
	        }
	    }
	}


