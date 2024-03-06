package SolvedAssignments;

public class ChkNumDiv 
{

	    public static void main(String[] args)
	    {
	        // Iterate from 1 to 500
	    		for (int i = 1; i <= 500; i++)
	    			{
	    			// Check if the number is divisible by 3 and 5
	    				if (i % 3 == 0 && i % 5 == 0)
	    					{
	    						System.out.println("Computer & Mouser " + i);
	    					} 
	    			// Check if the number is divisible by 3
	            else if (i % 3 == 0) 
	            	{
	            		System.out.println("Computer " + i);
	            } 
	            // Check if the number is divisible by 5
	            else if (i % 5 == 0)
	            {
	                System.out.println("Mouser " + i);
	            }
	        }
	    }
	}


