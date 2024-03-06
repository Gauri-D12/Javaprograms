package assignments;

public class MethodConstover {

	void add(int a)// void is return type, add id 
	{
		int c=a+50;
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
    MethodConstover(int a)// need to change the method name
	{
	   	int c= a+80;
		System.out.println(c);		
	}
	MethodConstover(double b,int a)// need to change the method name
	{
		double k=1000-b;
				
		System.out.println(k);
		
		int c =a -30;
		System.out.println(c);
		
	}
	 MethodConstover(char a,double b,int c)
	{
		char ch='D';
		System.out.println(ch);
		
		double d1=50.44;
		System.out.println(d1);
		
		int i=20;
		System.out.println(i);
		
		//System.out.println("This job is for QA");
			
	}	
	public static void main(String[] args)
	
	{
		System.out.println("This is Method and Constructor Overloading");
		MethodConstover m1=new MethodConstover();// 
		m1.add(60);
		m1.add(30, 50);
		add(5678,230,150);
	//	MethodConstover m2 = new MethodConstover();
		MethodConstover(40);
		MethodConstover(1000,98);
		MethodConstover('K',54321,62);
	}

}// need to declare only one object , change the method name 
