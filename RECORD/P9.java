// Write a program to find the area of rectangle, circle and square using
// overloaded functions.
import java.util.Scanner;
class P9
{
	int area(int l, int b)
	{
		return l*b;
	}
	double area(int r, double pi)
	{
		return pi*r*r;
	}
	int area(int a)
	{
		return a*a;
	}
	public static void main(String[] args)
	{
		P9 fig = new P9();
		Scanner in = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("\tFinding area\n1. Rectangle\n2. Circle\n3. Square\n4. Exit\nEnter your choice:: ");
			ch = in.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the length and breadth:: ");
						int l = in.nextInt(), b = in.nextInt();
						System.out.println("Area:: "+ fig.area(l,b));
						break;
				case 2: System.out.println("Enter the radius:: ");
						int r = in.nextInt();
						System.out.println("Area:: "+ fig.area(r,3.14));
						break;
				case 3: System.out.println("Enter the length of the side:: ");
						int a = in.nextInt();
						System.out.println("Area:: "+ fig.area(a));
						break;
				case 4: break;
				default: System.out.println("Invalid input!!!");
			}
		}while(ch!=4);
		System.out.println("Exiting...");
	}
}







// public class HelloWorld{
//     double power(double n, double p)
//     {
//         if (p==0) return 1;
//         if(p>=0)
//             return n*power(n, p-1);
//         else
//             return (1.0/n)*(power(n, p+1));
//     }
//      public static void main(String []args){
//          HelloWorld h = new HelloWorld();
//         System.out.println(h.power(4,-3));
//      }
// }