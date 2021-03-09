interface Run
{
	void display();
	public static void test()
	{
		System.out.println("This is Static Test()");
	}
	public default void demo()
	{
		System.out.println("This is default demo()");
	}
}
class Demo implements Run
{
	@Override
	public void display()
	{
		System.out.println("This is Abstract Overridden display()");
	}
}
class DefaultKeyword
{
	public static void main(String[] args) 
	{
		
	Demo d = new Demo();
	d.display();
	Run.test();
	d.demo();
	}
}