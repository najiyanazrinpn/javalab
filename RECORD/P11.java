import java.util.Scanner;
class Student
{
	String name;
	float acScr;
	Student(String nm, float ac)
	{
		name = nm;
		acScr = ac;
	}
}
interface Sports
{
	float spScr = 40;
}
class Result extends Student implements Sports
{
	Result(String nm, float ac)
	{
		super(nm, ac);
	}
	void display()
	{
		System.out.println("Student name: "+this.name+"\nAcademic score: "+this.acScr+"\nSports score: "+this.spScr);
	}
}
class P16
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String nm;
		float ac, sprt;
		System.out.println("Enter the name:: ");
		nm = in.nextLine();
		System.out.println("Enter the academic score:: ");
		ac = in.nextFloat();
		Result rs = new Result(nm, ac);
		rs.display();
	}
}