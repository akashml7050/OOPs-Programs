interface User
{
	public void Login(boolean logged_in);
}
class InternetBanking implements User
{
	public void Login(boolean logged_in)
	{
		if(logged_in == true )
		{
			System.out.println("Account Number Verified and Logged in");
		}
		else
		{
			System.out.println("Wrong OTP/Account Number");
		}
	}
}
class MobileBanking implements User
{
	public void Login(boolean logged_in)
	{
		if(logged_in == true)
		{
			System.out.println("Account Number Verified And Logged in");
		}
		else
		{
			System.out.println("Wrong OTP/Account Number");
		}
	}
}
class Spring
{
	public User ChooseUser(String type)
	{
		if(type.equalsIgnoreCase("Web"))
		{
			InternetBanking ib = new InternetBanking();
			return ib;
		}
		else 
		{
			MobileBanking mb = new MobileBanking();
			return mb;
		}
	}
}
class Banking
{
	public static void main(String[] args)
	{
		Spring s1 = new Spring();
		User ib = s1.ChooseUser("Web");
		ib.Login(true);
	}
}