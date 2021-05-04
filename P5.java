class Student
{
	String name;
	int rollNo;
	float mark1, mark2, mark3, total;
	Student(String nm, int rno,  float m1, float m2, float m3)
	{
		name = nm;
		rollNo = rno;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
		total = mark1+mark2+mark3;
	}
	void highest(Student s1, Student s2)
	{
		if((total>s1.total)&&(total>s2.total))
			System.out.println(name+" has highest mark");
		else if(s1.total>s2.total)
			System.out.println(s1.name+" has highest mark");
		else
			System.out.println(s2.name+" has highest mark");
	}

}
class P5
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Anu",4,40,42,45);
		Student s2 = new Student("Deepak",10,48,41,47);
		Student s3 = new Student("Smriti",32,40,46,49);
		s1.highest(s2,s3);
	}
}