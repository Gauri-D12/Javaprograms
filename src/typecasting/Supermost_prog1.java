package typecasting;

class supermost
{
					//public class Supermost_prog1
	void division()
	{
		int a=10;
		double b=25.20;
		double div=b/a;
		System.out.println(div);
	}
}
	
	class grandparent extends supermost
	{
		void add()
		{
		int a = 10;
		double b= 25.20;
		double sum= a+b;
		System.out.println(sum);		
		}
	}
	
	
	class classparent extends supermost
	{
		void sub()
		{
			int a = 10;
			double b= 25.20;
			double sub= a-b;
			System.out.println(sub);			
		}
		
	}
	
	class classparent extends grandparent 
	{
		void multi()
		{

			int a = 10;
			double b= 25.20;
			double multi= a*b;
			System.out.println(multi);
			
		}
		
	}
	
	public class downcasting extends classparent 
	{
	void subtraction()
	{
		int a = 10;
		double b= 25.20;
		double sub= a-b;
		System.out.println(sub);	
		
	}
	
	
	public static void main(String[] args) 	
	
	{
		supermost s1 = new grandparent();//implicit way
		s1.division();
		grandparent g1 = new classparent();
		g1.add();
		g1.division();
			classparent c1=(classparent) new , grandparent();
			c1.division();
			g1.add();
		
		
		
		
		
	}

}
	

