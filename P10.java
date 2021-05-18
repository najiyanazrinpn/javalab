import java.util.Scanner;
class Matrix
{
	int m, n;
	int a[][] = new int[10][10];
	Matrix()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		m = in.nextInt();
		n = in.nextInt();
		System.out.println("Enter the elements: ");
		for (int i = 0; i<m; i++)
			for (int j = 0; j<n; j++)
				a[i][j]=in.nextInt();
	}
	void symmetric()
	{
		int f = 0;
		if(m!=n)
			f=1;
		else
			for (int i = 0; i<m; i++)
				for (int j = i; j<n; j++)
					if (a[i][j]!=a[j][i])
						f = 1;
		if(f == 0)
			System.out.println("Symmetric");
		else
			System.out.println("Not symmetric");
	}

}
class P10
{
	public static void main(String[] args)
	{
		System.out.println("Symmetric or not");
		Matrix m1 = new Matrix();
		m1.symmetric();
	}
}