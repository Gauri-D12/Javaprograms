package assignments;

public class Methoddiff 
{
	  void add(int a)
		{
			int c= a + 20;
			System.out.println(c);
		}
	  void sub(int a)
	  {
		  int c= a-50;
		  System.out.println(c);
	  }
	  void mult(int a)
	  {
		  int c= a*5;
		  System.out.println(c);
	  }
	  void div(int a)
	  {
		  int c= a/5;
		  System.out.println(c);
	  }
	  void per(int a)
	  {
		  int c= a%3;
		  System.out.println(c);
	  }

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Methoddiff m1 =new Methoddiff();
		m1.add(5);
		m1.sub(100);
		m1.mult(12);
		m1.div(70);
		m1.per(125);
		
	}

}
