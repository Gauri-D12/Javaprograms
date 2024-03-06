package basicprograms;

public class Forth {

	Forth()
	{
		System.out.println("This is my consttructor");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//System.out.println("This is my consttructor");
		Forth f1=new Forth();//  we create two times object here 
		new Forth();// we can call multiple times object
	}

}
