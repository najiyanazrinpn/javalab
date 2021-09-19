import java.io.*;
class P22
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("integers.txt");
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw1 = new FileWriter("odd.txt");
			BufferedWriter bw1 = new BufferedWriter(fw1);

			FileWriter fw2 = new FileWriter("even.txt");
			BufferedWriter bw2 = new BufferedWriter(fw2);

			String s = "";

			while((s=br.readLine())!=null)
			{
				String[] intarray = s.split(" ");
				for(String i: intarray)
				{
					int a = Integer.parseInt(i);
					if(a%2!=0)
					{
						bw1.write(i+" ");
						bw1.flush();
					}
					else
					{
						bw2.write(i+" ");
						bw2.flush();
					}
				}
				bw1.newLine();
				bw1.flush();
				bw2.newLine();
				bw2.flush();
			}

			fr.close();
			fw1.close();
			fw2.close();
		}
		catch(Exception e)
		{

		}
	}
}