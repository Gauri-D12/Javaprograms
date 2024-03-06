package basicprograms;

public class Constover1 {
	
  void add(int a)// void is return type, add id 
	{
		int c=a+10;
		System.out.println(c);
	}
   void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	 static void add(double a,int b, int c)
	{
		double d=a+b+c;
		System.out.println(d);
		
	}
	
	static void sub(double a,int b,int c)
	{
		double d=a+b+c;
		System.out.println(d);
	}
	
	static void add(String a,char b)
	{
		System.out.println(a);
		System.out.println(b);		
	}
		
	public static void main(String[] args)
		{
		 add("Gauri",'D');
		 add(3.33,66,80);
		 Constover1 c1=new Constover1();
		 c1.add(5,50);
		 c1.add(40);
		
				
		
		}
}
