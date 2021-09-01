//Find the average of N positive integers, raising a 
//user defined exception for each negative input.
import java.util.Scanner;
class P15
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n, x, total=0;
		System.out.println("Enter the limit:: ");
		n = in.nextInt();
		for (int i = 1; i<=n; i++)
		{
			System.out.println("Enter the positive integer"+i+":: ");
			x = in.nextInt();
			try
			{
				if(x<0)
				{
					throw new Exception(x+" is negative");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
				x=0;
				i--;
			}
			total+=x;
		}
		System.out.println("Average = "+(total*1.0/n));
	}
}