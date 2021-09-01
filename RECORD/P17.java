/*17. Define 2 classes; one for generating Fibonacci numbers and other for 
displaying even numbers in a given range. Implement using threads. (Runnable Interface)
*/
import java.util.Scanner;
class FibonacciThread implements Runnable
{
	int n;
	FibonacciThread(int n1)
	{
		n = n1;
	}
	public void run()
	{
		int f1 = -1, f2 = 1, f3 = 0;
		for (int i = 1; i <= n; i++)
		{
			
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.println("Fibonacci:: "+f3);
		}
	}
}
class EvenThread implements Runnable
{
	int start, end;
	EvenThread(int n1, int n2)
	{
		start = n1;
		end = n2;
	}
	public void run()
	{
		if ( start%2 !=0 )
			start++;
		if ( end%2 !=0 )
			end--;
		for (int i = start; i <= end; i+=2)
		{
			System.out.println("Even:: "+i);
		}
	}
}
class P17
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n1, n2;
		System.out.println("---Fibonacci Numbers---\nEnter the limit:: ");
		n1 = in.nextInt();
		
		FibonacciThread t1 = new FibonacciThread(n1);//Object creation
		Thread T1 = new Thread(t1);

		System.out.println("---Even numbers---\nEnter the range:: ");
		n1 = in.nextInt();
		n2 = in.nextInt();

		
		EvenThread t2 = new EvenThread(n1, n2);
		Thread T2 = new Thread(t2);

		T1.start();

		T2.start();
	}
}
