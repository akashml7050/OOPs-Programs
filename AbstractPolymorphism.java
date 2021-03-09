abstract class Sample
{
	abstract public void test();
}
class Demo extends Sample
{
	@Override
	public void test()
	{
		System.out.println("This is Overriden test() of Demo class");
	}
}
class AbstractPolymorphism
{
	public static void main(String[] args) {
		
	Demo ref1 = new Demo();
	Sample ref2 = ref1;
	ref2.test();
}
}