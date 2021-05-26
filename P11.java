import java.util.Scanner;
class Employee
{
	int eNo;
	String eName;
	double eSalary;
	Employee(int no, String name, double salary)
	{
		eNo = no;
		eName = name;
		eSalary = salary;
	}
	void display()
	{
		System.out.println("Employee no::\t"+eNo+"\nEmployee name::\t"+eName+"\nSalary::\t"+eSalary);
	}
}
class P11
{
	public static void main(String[] args)
	{
		int f = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter the number of employees: ");
		int n = in.nextInt();
		Employee emp[] = new Employee[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Employee"+(i+1)+":");
			System.out.print("Enter the employee no: ");
			int no = in.nextInt();
			System.out.print("\nEnter the employee name: ");
			String name = in.next();
			System.out.print("\nEnter the employee salary: ");
			double salary = in.nextFloat();
			emp[i] = new Employee(no, name, salary);
		}
		System.out.print("\nEnter the employee no of the employee to be searched: ");
		int search = in.nextInt();
		for(Employee i:emp)
		{
			if(i.eNo == search)
			{
				System.out.println("\nEmployee found!!!");
				i.display();
				f=1;
				break;
			}
		}
		if (f == 0)
			System.out.println("\nEmployee not found!!!");
	}
}