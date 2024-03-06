package basicprograms;

public class Third {
	
	Third()
	{
		System.out.println("This is my constructor");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("This is my main method");
		subtract();
		Third t1=new Third();
		t1.add();
	}
	
	void add()
	{
		System.out.println("This my non static method");
	}
	static void subtract()
{
		System.out.println("This is my static method");
	}
	
	
}

