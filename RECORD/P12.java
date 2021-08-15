import java.util.Scanner;
import java.lang.Math.*;
interface Inter
{
	public double area();
	public double perimeter();
}
class Circle implements Inter
{
	double radius;
	Circle(double r)
	{
		radius = r;
	}
	public double area()
	{
		return (Math.PI*radius*radius);
	}
	public double perimeter()
	{
		return (2*Math.PI*radius);
	}
}
class Rectangle implements Inter
{
	double length, breadth;
	Rectangle(double l, double b)
	{
		length = l;
		breadth = b;
	}
	public double area()
	{
		return (length*breadth);
	}
	public double perimeter()
	{
		return (2*(length+breadth));
	}
}
class P17
{
	public static void main(String[] args)
	{
		int ch;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("1. Rectangle\t2. Circle\t3. Exit\nEnter::");
			ch = in.nextInt();
			switch (ch)
			{
				case 1:
						double l,b;
						System.out.println("Enter the length and breadth:: ");
						l = in.nextDouble();
						b = in.nextDouble();
						Rectangle rect = new Rectangle(l, b);
						System.out.println("Area of the rectangle:: "+rect.area());
						System.out.println("Area of the rectangle:: "+rect.perimeter());
						break;
				case 2:
						double r;
						System.out.println("Enter the radius:: ");
						r = in.nextDouble();
						Circle cir = new Circle(r);
						System.out.println("Area of the circle:: "+cir.area());
						System.out.println("Area of the circle:: "+cir.perimeter());
						break;
				case 3:
						System.out.println("Exiting..."); break;
				default:
						System.out.println("Invalid choice!!!");
			}
		}while(ch!=3);
	}
}
