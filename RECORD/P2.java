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
	void add(Matrix m2)
	{
		if((m==m2.m)&&(n==m2.n))
		{
			System.out.println("Sum:");
			for (int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
					System.out.print((a[i][j]+m2.a[i][j])+"\t");
				System.out.println();
			}
		}
		else
			System.out.println("Error!!!");
	}

}
class P2
{
	public static void main(String[] args)
	{
		System.out.println("Matrix1: ");
		Matrix m1 = new Matrix();
		System.out.println("Matrix2: ");
		Matrix m2 = new Matrix();
		m1.add(m2);
	}
}