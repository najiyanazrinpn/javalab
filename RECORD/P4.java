import java.util.Scanner;
class Complex
{
	float x,y;
	Complex()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the real part and imaginary part::");
		x = in.nextFloat();
		y = in.nextFloat();
	}
	public void add(Complex o)
	{
		System.out.println(x+" + "+y+"i  +");
		x += o.x;
		y += o.y;
		System.out.println(o.x+" + "+o.y+"i  =\n-----------\n"+x+" + "+y+"i");
	}
}
public class P4
{
	public static void main(String[] args)
	{
		System.out.println("Complex number1::");
		Complex z1 = new Complex();
		System.out.println("Complex number2::");
		Complex z2 = new Complex();
		System.out.println("Sum::");
		z1.add(z2);
	}
}