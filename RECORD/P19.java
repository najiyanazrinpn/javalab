import java.util.*;
public class P19
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		int ch, c, x;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("\n1. Add an element\n2. Display list\n3. Exit\nEnter:: ");
			ch = in.nextInt();
			switch(ch)
			{
				case 1: System.out.print("\nEnter the element:: ");
						x = in.nextInt();
						list.add(x);
						break;
				case 2: System.out.print("\nList:: ");
						System.out.println(list);
						break;
				case 3: break;
				default: System.out.println("\nInvalid choice!!!");
			}
		}while(ch!=3);
		System.out.println("\nExiting...");
		System.out.println("\nList before removing all elements:: "+list);
		list.clear();
		System.out.println("\nList before removing all elements:: "+list);
	}
}