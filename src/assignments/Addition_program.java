package assignments;
//how to create the relationship betwwen class and interface 
interface LoginDetails
{
	void login();
	void logout();
}
public class Addition_program implements LoginDetails
{

	public static void main(String[] args) 
	{
		Addition_program a1=new Addition_program();
		a1.login();
	}
	public void login() 
	{
		System.out.println("YOur Actual Logic of login");
	}
	public void logout() 
	{
		System.out.println("YOur Actual Logic of logout");
	}

}
