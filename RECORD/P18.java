/*18. Maintain a list of Strings using ArrayList from the collection framework, perform 
built-in operations.*/
import java.util.*;
 public class P18
{
	public static void main(String[] args)
	{
		ArrayList<String> ar = new ArrayList<String>(); 
		Scanner in = new Scanner(System.in);
		int ch, n;
		String x;
		do
		{
			System.out.println("\n---ArrayList Operations---");
			System.out.println("1. Append an element\n2. Insert an element at a specified position\n3. Remove an element from the arraylist\n4. Remove an element at a specified position\n5. Replace an element at a specified position with an element\n6. Get the number of elements in the list\n7. Get the element of specified position\n8. Display the arraylist elements\n9. Sort the elements in ascending order\n10. Sort the elements in ascending order\n11. Exit\nEnter:: ");
			ch = in.nextInt();in.nextLine();
			switch(ch)
			{
				case 1: System.out.println("Enter a string value to be appended:: ");
						x = in.nextLine();
						ar.add(x);
						System.out.println("ArrayList:: "+ar);
						break;
				case 2: System.out.println("Enter the position to be inserted:: ");
						n = in.nextInt();in.nextLine();
						
						if((n<=(ar.size()+1))&&(n>=1))
						{
							System.out.println("Enter the value to be inserted:: ");
							x = in.nextLine();
							ar.add(n-1, x);
							System.out.println("ArrayList:: "+ar);
						}
						else
							System.out.println("Invalid position!!!");
						break;
				case 3: System.out.println("Enter the value to be deleted:: ");
						x = in.nextLine();
						ar.remove(x);
						System.out.println("ArrayList:: "+ar);
						break;
				case 4: if(ar.size()==0)
							System.out.println("Sorry!!! Your list is empty!!!");
						else
						{
							System.out.println("Enter the position of the element to be deleted:: ");
							n = in.nextInt();in.nextLine();
							ar.remove(n-1);
							System.out.println("ArrayList:: "+ar);
						}
						break;
				case 5: System.out.println("Enter the position of the element to be replaced:: ");
						n = in.nextInt();in.nextLine();
						if((n>ar.size())||(n<=0))
							System.out.println("Invalid position!!!");
						else
						{
							System.out.println("Enter the new value:: ");
							x = in.nextLine();
							ar.set(n-1, x);
							System.out.println("ArrayList:: "+ar);
						}
						break;
				case 6: System.out.println("Number of elements in the list is:: "+ar.size());
						break;
				case 7: System.out.println("Enter the position:: ");
						n = in.nextInt();in.nextLine();
						System.out.println("Element in position "+n+" is:: "+ar.get(n));
				case 8: if(ar.size()==0)
							System.out.println("Sorry!!! Your list is empty!!!");
						else
						{
							System.out.print("Elements in the list are:: ");
							for (String i: ar)
								System.out.print(i+" ");
							System.out.println();
						}
						break;
						
				case 9: Collections.sort(ar);
						System.out.println("Sorted list in ascending order:: "+ar);
						break;
				case 10:Collections.sort(ar, Collections.reverseOrder());
						System.out.println("Sorted list in descending order:: "+ar);
						break;
				case 11: break;
				default: System.out.println("Invalid input!!!");
			}
		}while(ch!=11);
		System.out.println("Exiting...");
	}
}
