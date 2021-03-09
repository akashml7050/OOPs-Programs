class Sample 
{
	int a = 10101;
	public void big(int a)
	{
		System.out.println("This is big() of SuperClass");
	}
}
class Demo extends Sample
{
	String a = "Bold";
	String b = "Capital";
	public void test()
	{
		System.out.println("This is the test() of SubClass");
		System.out.println(a);
		System.out.println(b);
		System.out.println(super.a);
		big(10);
		super.big(10);
	}
	public void big(int a)
	{
		System.out.println("This is big() of SubClass");
	}
}
class SuperKeyword
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.test();
	}
}