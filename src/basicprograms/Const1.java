package basicprograms;
public class Const1 {
	// Constructor Overloading
	Const1()
	{
		System.out.println("1");
		
	}
	
	Const1(int a)
	{
		int c= a+9;
		System.out.println(c);
	}

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
			new Const1();//without parameter
			new Const1(9);
			new Const1();
	}

}
