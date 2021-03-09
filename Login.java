abstract class User
{
	abstract public void login(String name,String password,boolean login);
	public void logout(boolean logout)
	{
		if(logout == true)
		{
			System.out.println("Success fully Logged Out");
		}
		else
		{
			System.out.println("Error");
		}
	}
}
class Customer extends User
{
	public void login(String name,String password,boolean login)
	{
		if(login == true&&password == "****")
		{
			System.out.println("Logged in As Customer : "+name);
		}
		else
		{
			System.out.println("Cannot find User");
		}
	}
}
class Admin extends User
{
	public void login(String name,String password,boolean login)
	{
		if(login == true&&password == "****")
		{
			System.out.println("Logged in As Admin : "+name);
		}
		else
		{
			System.out.println("Not an Admin");
		}
	}
}
class Login
{
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.login("Gray","****",true);
		c1.logout(true);
		Admin a1 = new Admin();
		a1.login("George","****",true);

	}
}