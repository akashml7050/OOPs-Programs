interface Method
{
	 int findAvg(double n1,double n2);
	 double findSum(int a1,int a2);
}
class Execute implements Method
{
	public int findAvg(double n1,double n2)
	{
		double avg = (n1 + n2)/2;
		return (int)avg;
	}
	public double findSum(int a1,int a2)
	{
		int sum = a1 + a2;
		return sum;
	}
}
class Typecasting
{
	public static void main(String[] args) {
		int a = 110;
		double b = a;
		System.out.println("Number before Widening :"+a);
		System.out.println("Number After Casting :"+b);
		double a1 = 110;
		int b1 = (int)a;
		System.out.println("Number before Narrowing :"+a1);
		System.out.println("Number After Casting :"+b1);
		System.out.println();
		Execute e = new Execute();
		System.out.println("Average : "+e.findAvg(10.5,23.6));
		System.out.println("SUM     : "+e.findSum(10,23));	
	}
}