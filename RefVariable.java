class Account
{
	long acntno = 7554333;
	String owner = " akash";
	double bal = 0.00;
	String type = "Savings";
	String branch = "BTR";
	static String bankname = "ICICI";
	public static void showBankname()
	{
		System.out.println(bankname);
	}
		public void showAcntDetails()
	{
		System.out.println(acntno);
		System.out.println(owner);
		System.out.println(bal);
		System.out.println(type);
		System.out.println(branch);
		System.out.println(bankname);
	}

	public void deposit(double amt)
	{
		if(amt>0)
		{
			bal=bal+amt;
		}
		else
		{
			System.out.println("invalid ammount ");
		}
	}
	public void withdraw(double amt1)
	{
		if(bal>=amt1)
		{
			bal=bal-amt1;
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	public void showbal()
	{
		System.out.println(bal);
	}
}
class RefVariable
{
	public static void main(String[] args) 
	{
		Account.showBankname();
		new Account().showAcntDetails();
			Account ref1 = new Account();
			ref1.showbal();
			ref1.deposit(100);
			ref1.showbal();
			Account ref2=ref1;
			System.out.println("ref1:"+ref1);
			System.out.println("ref2:"+ref2);
			ref2.withdraw(20);
			ref1.showbal();
			Account ref3= new Account();
			ref3.deposit(50);
			ref2.withdraw(10);
			ref3.showbal();
			ref2.showbal(); 
	}
}