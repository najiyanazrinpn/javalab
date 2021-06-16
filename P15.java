import java.util.Scanner;
class Person
{
	String name, address;
	char gender;
	int age;
	Person(String nm, char gn, String adrs, int ag)
	{
		name = nm;
		gender = gn;
		address = adrs;
		age = ag;
	}
}
class Employee extends Person
{
	int empID;
	String companyName, qualification;
	float salary;
	Employee(String nm, char gn, String adrs, int ag, int id, String cnm, float slry, String qfcn)
	{
		super(nm, gn, adrs,ag);
		empID = id;
		companyName = cnm;
		salary = slry;
		qualification = qfcn;
	}
}
class Teacher extends Employee
{
	String subject, department;
	int teacherID;
	Teacher(String nm, char gn, String adrs, int ag, int id, String cnm, float slry, String qfcn, String sub, String dep, int tchrId)
	{
		super(nm, gn, adrs, ag, id, cnm, slry, qfcn);
		subject = sub;
		department = dep;
		teacherID = tchrId;
	}
	void display()
	{
		System.out.println("\nEmployee Name:: "+name);
		System.out.print("Gender:: ");
		if(gender=='m'||gender=='M')
			System.out.println(" Male");
		else if(gender=='f'||gender=='F')
			System.out.println(" Female");
		else
			System.out.println(" Others");
		System.out.println("Address:: "+address);
		System.out.println("Age:: "+age);
		System.out.println("Employee ID:: "+empID);
		System.out.println("Company name:: "+companyName);
		System.out.println("Salary:: "+salary);
		System.out.println("Qualification:: "+qualification);
		System.out.println("Subject:: "+subject);
		System.out.println("Department:: "+department);
		System.out.println("Teacher ID:: "+teacherID);
	}
}
class P15
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String nm, adrs, qfcn, sub, dep, cnm;
		char gn;
		int n, ag, id, tchrId;
		float slry;
		System.out.println("Enter the number of teachers:: ");
		n = in.nextInt(); in.nextLine();
		Teacher t[] = new Teacher[n];
		
		for (int i=0; i<n; i++)
		{
			System.out.println("Teacher"+(i+1)+":: ");
			System.out.print("Enter the Name:: ");
			nm = in.nextLine();
			System.out.print("Male or Female or Others(m,f,o)?:: ");
			gn = in.next().charAt(0); in.nextLine();
			System.out.print("Enter the address:: ");
			adrs = in.nextLine();
			System.out.print("Enter the age:: ");
			ag = in.nextInt(); in.nextLine();
			System.out.print("Enter the employee id:: ");
			id = in.nextInt(); in.nextLine();
			System.out.print("Enter the company name:: ");
			cnm = in.nextLine();
			System.out.print("Enter the qualification:: ");
			qfcn = in.nextLine();
			System.out.print("Enter the salary:: ");
			slry = in.nextFloat(); in.nextLine();
			System.out.print("Enter the subject:: ");
			sub = in.nextLine();
			System.out.print("Enter the department:: ");
			dep = in.nextLine();
			System.out.print("Enter the teacher id:: ");
			tchrId = in.nextInt(); in.nextLine();
				
			t[i] = new Teacher(nm, gn, adrs, ag, id, cnm, slry, qfcn, sub, dep, tchrId);
		}
		for (Teacher i: t)
		{
			i.display();
		}
	}
}
