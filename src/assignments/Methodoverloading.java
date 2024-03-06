package assignments;

public class Methodoverloading 
{
	void job(int a)
	{
		System.out.println("This job is for HR");
		
	}
	static void job(double b,int a)
	{
		System.out.println("This job is for Manager");
		
	}
	static void job(char a,double b,int c)
	{
		System.out.println("This job is for QA");
			
	}
	
	void job(char a,double b)
	{
		System.out.println("THis job is for Software Engineer QA");
	}
	void job(double a)
	{
		System.out.println("This Job is for IT trainer");
		
	}
		
	public static void main(String[] args)
	{
		System.out.println("I am proud to I am QA");
		Methodoverloading m1 =new Methodoverloading();
		m1.job(15000);
		job(10500.59,500);
		job('G',98.66,50);
		m1.job('A', 148.67);
		m1.job(87.99);

	}

}
