class Rectangle
{
	double length, width, area;
	String color;
	Rectangle(double l, double w, String c)
	{
		length = l;
		width = w;
		color = c;
	}
	double findArea()
	{
		return(length*width);
	}
	void compareRectangle(Rectangle r)
	{
		if((findArea()==r.findArea())&&(color==r.color))
			System.out.println("Matching Rectangles");
		else
			System.out.println("Non Matching Rectangles");
	}
}
class P7
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(3,2,"Red");
		Rectangle r2 = new Rectangle(6,1,"Red");
		r1.compareRectangle(r2);
	}
}