/*16. Define 2 classes; one for generating a multiplication table of 5 and other for
 displaying first N prime numbers. Implement using threads. (Thread class)
*/
import java.lang.*;
import java.util.Scanner;
class MultiplicationThread extends Thread
{
	public void run()
	{
		for ( int i=1; i<=10; i++)
		{
			System.out.println("5 x "+i+" = "+5*i);
		}
	}
}
class PrimeThread extends Thread
{
	int n;
	boolean checkPrime(int x)
	{
		if (x <= 1)
            return false;
        else if (x == 2)
            return true;
        else if (x % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(x); i += 2)
        {
            if (x % i == 0)
                return false;
        }
        return true;
	}
	PrimeThread(int num)
	{
		n = num;
	}
	public void run()
	{
		for (int i = 1; i<=n; i++)
		{
			if(checkPrime(i))
				System.out.println(i);
		}
	}
}
class P16
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter");
		int n = in.nextInt();
		MultiplicationThread mul = new MultiplicationThread();
		PrimeThread pr = new PrimeThread(n);
		mul.start();
		pr.start();
	}
}