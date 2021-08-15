import java.util.Scanner;
class Employee
{
	int empId;
	String name, address;
	float salary;
	Employee(int id,String nm, float slry, String adrs)
	{
		empId = id;
		name = nm;
		salary = slry;
		address = adrs;
	}
}
class Teacher extends Employee
{
	String department, subjects_taught;
	Teacher(int id, String nm, float slry, String adrs, String dpmt, String sub)
	{
		super(id,nm,slry,adrs);
		department = dpmt;
		subjects_taught = sub;
	}
	void display()
	{
		System.out.println("\nEmployee ID:: "+empId);
		System.out.println("Employee Name:: "+name);
		System.out.println("Salary:: "+salary);
		System.out.println("Address:: "+address);
		System.out.println("Department:: "+department);
		System.out.println("Subjects Taught:: "+subjects_taught);
	}
}
class P14
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int id;
		String nm, adrs, dpmt, sub;
		float slry;
		System.out.println("Enter the number of teachers: ");
		int N = in.nextInt();
		Teacher t[] = new Teacher[N];
		for(int i=0; i<N; i++)
		{
			System.out.println("Teacher"+(i+1)+":: ");
			System.out.print("Enter the employee id:: ");
			id = in.nextInt(); in.nextLine();
			System.out.print("Enter the employee name:: ");
			nm = in.nextLine();
			System.out.print("Enter the salary:: ");
			slry = in.nextFloat(); in.nextLine();
			System.out.print("Enter the address:: ");
			adrs = in.nextLine();
			System.out.print("Enter the department:: ");
			dpmt = in.nextLine();
			System.out.print("Subjects taught:: ");
			sub = in.nextLine();
			t[i] = new Teacher(id, nm, slry, adrs, dpmt, sub);
		}
		System.out.println("\n--Details--\n");
		for(Teacher i:t)
			i.display();
	}
}