class Sample2
{
	static int a1=10;
	int b1=123;
	public  void test()
	{
		System.out.println("test() method  of Sample2 class");
		double a1= 123.43;
	    String b1="abc";
		System.out.println("a1:"+a1);//local variable
		System.out.println("b1:"+b1);//local variable
		System.out.println("a1:"+Sample2.a1);//globle static data member
		System.out.println("b1:"+this.b1);//globle non static data member
	}
		public static void main(String[] args) {
			new Sample2().test();
			String b="bca";
			System.out.println("b:"+b);//local non static variable in main() 
			System.out.println("b1:"+new Sample2().b1); //globle non static variable in main()
		}
	
	}