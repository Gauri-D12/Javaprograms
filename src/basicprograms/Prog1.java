package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];		
		Scanner input=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			System.out.println("Please enter the value:->");
					rollno[i]=		input.nextInt();
					
		}	
	System.out.println(Arrays.toString(rollno));
		
	}

}
