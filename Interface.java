interface Run1
{
	public void display();
}
interface Run2 extends Run1
{
	int a = 10;
	public void count();
}
class Demo implements Run2
{
	@Override
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
class Interface
{
	public static void main(String[] args) {
		Run2 r;
		Demo s = new Demo();
		s.count();
		System.out.println(s.a);
		s.display();
	}
}