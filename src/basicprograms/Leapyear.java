package basicprograms;
public class Leapyear
{
	// a method that checks whether the   
	// year y is a leap year or not  
	boolean isLeapYr(int y)  
	{  
	// if condition that handles  
	// the century year as well as the non-century year  
	if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))  
	{  
	return true;  
	}  
	return false;  
	}  
	  
	// main method  
	public static void main(String argvs[])  
	{  
	// creating an object of the class Leapyear  
		Leapyear obj = new Leapyear();  
	  
	// we will be finding the leap years  
	// within the range r1 and r2 (r1 and r2 inclusive)  
	int r1 = 1990;  
	int r2 = 2035;  
	  
	System.out.println("Finding leap years within the range " + r1 + " and " + r2);  
	for(int i = r1; i <= r2; i++)  
	{  
	    if(obj.isLeapYr(i))  
	    {  
	        System.out.println(i + " ");  
	    }  
	}  
	   
	}  
	}  
