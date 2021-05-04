import java.util.Scanner;
class Employee
{
	String empID, empName;
	double msalary;
	Scanner in = new Scanner(System.in);
	public void read()
	{
		System.out.println("Enter the employee id:: ");
		empID = in.nextLine();
		System.out.println("Enter the employee name:: ");
		empName = in.nextLine();
		System.out.println("Enter the monthly salary:: ");
		msalary = in.nextDouble();
	}
	public void display()
	{
		System.out.println("Employee id:: "+empID);
		System.out.println("Employee name:: "+empName);
		System.out.println("Yearly salary:: Rs."+(msalary*12)+"/-");
	}
}
class P3
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		System.out.println("Employee1:: ");
		emp1.read();
		System.out.println("Employee2:: ");
		emp2.read();

		System.out.println("Employee1:: ");
		emp1.display();
		System.out.println("Employee2:: ");
		emp2.display();
	}
}