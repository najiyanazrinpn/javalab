import java.util.Scanner;
class Account
{
	long accno;
	String holdername, acctype;
	double balance;
	public void getData(long a, String name, String type)
	{
		accno = a;
		holdername = name;
		acctype = type;
		balance = 1000.0;
	}
	void credit(double m)
	{
		balance+=m;
		System.out.println("Amount Rs."+m+"/- credited\nEnter 1 to view balance else enter any number: ");
		Scanner in = new Scanner(System.in);
		int ch = in.nextInt();
		if(ch==1)
			balanceCheck();
		else
			System.out.println("Thank you, visit again!!!");
	}
	void debit(double m)
	{
		if(balance-m >=1000)
		{
			balance-=m;
			System.out.println("Amount Rs. "+m+"/- debited\nEnter 1 to view balance else enter any number: ");
			Scanner in = new Scanner(System.in);
			int ch = in.nextInt();
			if(ch==1)
				balanceCheck();
			else
				System.out.println("Thank you, visit again!!!");
		}
		else
			System.out.println("Insufficient balance!!!");
	}
	void balanceCheck()
	{
		System.out.println("Balance:: "+balance);
	}
}
public class P1
{
	public static void main(String[] args)
	{
		int ch;
		String name, acctype;
		long accno;
		Scanner in = new Scanner(System.in);
		double amt;

		Account acc1 = new Account();
		System.out.println("Account1::");
		System.out.println("Enter the holder's name:: ");
		name = in.nextLine();
		System.out.println("Enter the account no:: ");
		accno = in.nextLong();
		System.out.println("0. Savings 1.Current\nSelect the account type:: ");
		ch = in.nextInt();
		if (ch == 0)
			acctype = "Savings";
		else if (ch == 1)
			acctype = "Current";
		else
		{
			System.out.println("Invalid choice!!! Created as Savings account.");
			acctype = "Savings";
		}
		acc1.getData(accno,name,acctype);
		System.out.println("Account created!!!");

		Account acc2 = new Account();
		System.out.println("Account2::");
		System.out.println("Enter the holder's name:: ");
		name = in.nextLine();
		System.out.println("Enter the account no:: ");
		accno = in.nextLong();
		System.out.println("0. Savings 1.Current\nSelect the account type:: ");
		ch = in.nextInt();
		if (ch == 0)
			acctype = "Savings";
		else if (ch == 1)
			acctype = "Current";
		else
		{
			System.out.println("Invalid choice!!! Created as Savings account.");
			acctype = "Savings";
		}
		acc2.getData(accno,name,acctype);
		System.out.println("Account created!!!");
		do
		{
			System.out.println("1. Debit\t2. Credit\t3. View balance\t4. Exit\nEnter your choice: ");
			ch = in.nextInt();
			if(ch!=4)
			{
				System.out.println("Enter account no: ");
				accno = in.nextLong();
				if(accno == acc1.accno)
					switch (ch)
					{
						case 1: System.out.println("Enter the amount to be withdrawn: ");
								amt = in.nextDouble();
								acc1.debit(amt);
								break;
						case 2: System.out.println("Enter the amount to be deposited: ");
								amt = in.nextDouble();
								acc1.credit(amt);
								break;
						case 3: acc1.balanceCheck();
								break;
						case 4: System.out.println("Exiting..."); break;
						default: System.out.println("Invalid choice!!!");
					}
				else
					switch (ch)
					{
						case 1: System.out.println("Enter the amount to be withdrawn: ");
								amt = in.nextDouble();
								acc2.debit(amt);
								break;
						case 2: System.out.println("Enter the amount to be deposited: ");
								amt = in.nextDouble();
								acc2.credit(amt);
								break;
						case 3: acc2.balanceCheck();
								break;
						case 4: System.out.println("Exiting..."); break;
						default: System.out.println("Invalid choice!!!");
					}
			}
		} while(ch!=4);
	}
}