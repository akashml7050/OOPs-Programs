class Sum
{
	public void CalcSum()
	{
		System.out.println("Sum is Null");
	}
	final void CalcSum(int x,int y)
	{
		System.out.println("Sum is "+(x+y));
	}
	public double CalcSum(double x,int y)
	{
		System.out.println("Sum is "+(x+y));
		return x+y;
	}
	private void CalcSum(int x,double y)
	{
		System.out.println("Sum is "+(x+y));
	}
	protected double CalcSum(double x,double y)
	{
		System.out.println("Sum is "+(x+y));
		return x+y;
	}
}
class MethodOverloading
{
	public static void main(String[] args) 
	{
		Sum s = new Sum();
		s.CalcSum();
		s.CalcSum(12,3);
		s.CalcSum(2.5,5);
		s.CalcSum(5,8.88);
		s.CalcSum(3.5,4.8);
	}
}