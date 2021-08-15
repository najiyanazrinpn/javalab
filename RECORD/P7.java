import java.util.*;
class Book
{
	String isbn, title, author, publisher;
	float price;
	Boolean state;
	Book(String bno, String tit, String aut, String pub, float pr)
	{
		isbn = bno;
		title = tit;
		author = aut;
		publisher = pub;
		price = pr;
		state=false;
	}
	void display()
	{
		System.out.println("\nISBN::\t"+isbn+"\nBook title::\t"+title+"\nAuthor::\t"+author+"\nPublisher::\t"+publisher+"\nBook Price::\t"+price);
	}
}
class P7
{
	public static void main(String[] args)
	{
		Book b[] = new Book[5];
		Scanner in = new Scanner(System.in);
		String titles[] = new String[5];
		for (int i=0; i<5; i++)
		{
			System.out.println("Book"+(i+1)+"::");
			System.out.print("\nEnter the ISBN:: ");
			String bno = in.nextLine();
			System.out.print("\nEnter the book title:: ");
			titles[i] = in.nextLine();
			System.out.print("\nEnter the author's name:: ");
			String aut = in.nextLine();
			System.out.print("\nEnter the publisher's name:: ");
			String pub = in.nextLine();
			System.out.print("\nEnter the book price:: ");
			Float pr = in.nextFloat();
			in.nextLine();
			b[i] = new Book(bno, titles[i], aut, pub, pr);
		}
		Arrays.sort(titles);
		System.out.println("\nSorted Book Details:: ");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if((titles[i]==b[j].title)&&(b[j].state==false))
				{
					b[j].state=true;
					b[j].display();
				}
			}
		}
	}
}