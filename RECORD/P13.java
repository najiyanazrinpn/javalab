import graphics.*;
import java.util.Scanner;
public class P13 implements graphics.Square
{
	public double area(double a)
	{
		return (a*a);
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int ch;
		double x, y;
		do
		{
			System.out.println("\tFinding area\n1. Rectangle\n2. Square\n3. Circle\n4. Triangle\n5. Exit\nEnter your choice:: ");
			ch = in.nextInt();
			switch(ch)
			{
				case 1: Rectangle r = new Rectangle();
						System.out.println("\n--Rectangle--\nEnter length and breadth:: ");
						x = in.nextDouble();
						y = in.nextDouble();
						System.out.println("\nArea:: "+ r.area(x, y));
						break;
				case 2: P13 s = new P13();
						System.out.println("\n--Square--\nEnter base:: ");
						x = in.nextDouble();
						System.out.println("\nArea:: "+ s.area(x));
						break;
				case 3: Circle c = new Circle();
						System.out.println("\n--Circle--\nEnter radius:: ");
						x = in.nextDouble();
						System.out.println("\nArea:: "+ c.area(x));
						break;
				case 4: Triangle t = new Triangle();
						System.out.println("\n--Triangle--\nEnter base and height:: ");
						x = in.nextDouble();
						y = in.nextDouble();
						System.out.println("\nArea:: :: "+ t.area(x, y));
						break;
				case 5: break;
				default: System.out.println("Invalid input!!!");
			}
		}while(ch!=5);
		System.out.println("Exiting...");
	}
}