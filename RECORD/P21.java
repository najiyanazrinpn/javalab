import java.io.*;
class P21
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("file1.txt");
			BufferedReader br = new BufferedReader(fr);
			String s="";
			FileWriter fw = new FileWriter("file2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			fr.close();
			br.close();
		}
		catch(Exception e)
		{}
	}
}