import arithmetic.*;
import java.util.Scanner;
public class P14 implements arithmetic.Modulus
{
	public int mod(int x, int y)
	{
		return (x%y);
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers:: ");
		int x = in.nextInt(), y = in.nextInt();
		
		int ch;
		do
		{
			System.out.println("\tArithmetic operations\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Exit\nEnter your choice:: ");
			ch = in.nextInt();
			switch(ch)
			{
				case 1: Addition a = new Addition();
						System.out.println("\n"+x+"+"+y+":: "+ a.add(x, y));
						break;
				case 2: Subtraction s = new Subtraction();
						System.out.println("\n"+x+"-"+y+":: "+ s.sub(x, y));
						break;
				case 3: Multiplication m = new Multiplication();
						System.out.println("\n"+x+"*"+y+":: "+ m.mul(x, y));
						break;
				case 4: Division d = new Division();
						System.out.println("\n"+x+"/"+y+":: "+ d.div(x, y));
						break;
				case 5: P14 r = new P14();
						System.out.println("\n"+x+"%"+y+":: "+ r.mod(x, y));
						break;
				case 6: break;
				default: System.out.println("Invalid input!!!");
			}
		}while(ch!=6);
		System.out.println("Exiting...");
	}
}