package SolvedAssignments;

public class MonthsPrintDays
{
	
    
    public static final int[] MONTH_DAY_RANGES = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
    public static final String[] MONTH_NAMES = {"January", "February", "March", "April", "May", "June", "July",
                                                "August", "September", "October", "November", "December"};

    
    public static String getMonthName(int day) 
    {
       
        for (int i = 0; i < MONTH_DAY_RANGES.length; i++)
        	{
        		if (day <= MONTH_DAY_RANGES[i])
        			{
        				return MONTH_NAMES[i];
        			}
        	}
        return "Invalid day"; 
    }

    public static void main(String[] args) 
    {
        
        for (int day = 1; day <= 365; day++) 
        	{
        		String month = getMonthName(day);
        		System.out.println("Day " + day + ": " + month);
        	}
    }
}