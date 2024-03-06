package assignments;

public class Practice1 {

	public static void main(String[] args) 
	{
		add();
		sub();
        mult();
        div();
	}
	
	public static void add()
	{
		
		System.out.println("public");
	}
	private static void sub()
	{
		System.out.println("Private");
		
	}
	protected static void mult()

	{
		System.out.println("Protected");
	}
	static void div()
	{
		System.out.println("Package");
	}
	
}
