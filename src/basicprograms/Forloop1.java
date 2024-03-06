package basicprograms;

public class Forloop1
{
	
	static void add()
	{
		int a=10;
		int b= 20;
		int c=a+b;
		System.out.println(c);
		
	}
	static void sub()
	{
		int a=10;
		int b= 20;
		int c=b-a;
		System.out.println(c);
		
	}
	
	static void mult()
	{
		int a=10;
		int b= 20;
		int c=a*b;
		System.out.println(c);
		
	}
	
	static void div()
	{
		int a=10;
		int b= 20;
		int c=b/a;
		System.out.println(c);
		
	}
	
	void reminder()
	{
		int a=10;
		int b= 21;
		int c=b%a;
		System.out.println(c);
		
	}
	public static void main(String[] args) 
	{
			
				add();
				sub();
				Forloop1 f1=new Forloop1();
				f1.mult();
				f1.div();
				f1.reminder();

	}

}
