package basicprograms;
public class Overloadingprog1 
{
	void add(int a)// main method is add
	{
		int c=a+6;
		
		System.out.println(c);
	}
	void add(int a,int b)//method name same but variation is different
	{
		int c=a+b;
		System.out.println(c);
	}
	static void add(double a,int b,int c)
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
		add("Ritu",'A');
		add(3.32,10,89);//we have call our 1st static method here
		Overloadingprog1 o1=new Overloadingprog1();// we call non static method here
		o1.add(7,90);//call the non static method by creating an object
		o1.add(87);
		
	}

}



