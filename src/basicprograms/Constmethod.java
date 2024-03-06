package basicprograms;

public class Constmethod {

	Constmethod(int a)
	{
		System.out.println("1st constructor");
		
	}
	Constmethod(double a,int b)
	{
		System.out.println("2ed constructor");
		
		
	}
	
	Constmethod(double a,int b,char c)
	{
		
		System.out.println("3rd constructor");
		
	}
	
	Constmethod(double a)
	{
		
		System.out.println("4th constructor");
		
	}
	
		
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Constmethod(64);
		new Constmethod(45.36,13);
		new Constmethod(77.88,94,'G');
		new Constmethod(87.9);
	}

}
