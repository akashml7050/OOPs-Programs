interface Run1
{
	public void display();
	public void test();
}
interface Run2 
{
	int a = 10;
	public void count();
	public void test();
}
class Demo implements Run1,Run2
{
	@Override
	public void test()
	{
		System.out.println("This is Overridden test() by MultipleInheritance");
	}
	public void display()
	{
		System.out.println("This is overridden display() of Interface Run1");
	}
	public void count()
	{
		System.out.println(Run2.a);
		System.out.println("This is the overridden count() of Interface Run2");
	}
}
class MultipleInheritanceInterface
{
	public static void main(String[] args) {
		Run2 r;
		Demo s = new Demo();
		s.count();
		System.out.println(s.a);
		s.display();
		s.test();
	}
}