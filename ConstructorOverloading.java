class Employee
{
	String name;
	double salary;
	String dept;
	String job;

	public Employee(String name,double salary,String dept,String job)
	{
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		this.job=job;
	}
	public Employee(String name,double salary,String job)
	{
		this.name=name;
		this.salary=salary;
		this.job=job;
	}
	public Employee(String name,String dept,String job)
	{
		this.name=name;
		this.dept=dept;
		this.job=job;
	}
	public Employee(String name)
	{
		this.name=name;
	}

	public void ShowEmployeeDetails()
	{
		System.out.println("Name ; "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Department : "+dept);
		System.out.println("Job Profile : "+job +'\n');
	}
}
class ConstructorOverloading
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Laxman",2500.0,"Dev","ASE");
		e1.ShowEmployeeDetails();
		Employee e2 = new Employee("Jay",1000.0,"QA");
		e2.ShowEmployeeDetails();
		Employee e3 = new Employee("Priya","Testing","Junior QA");
		e3.ShowEmployeeDetails();
	}
}