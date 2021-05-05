class Room
{
	int roomNo;
	String roomType;
	double roomArea;
	Room()
	{
		roomNo = 1;
		roomType = "Bed Room";
		roomArea = 200.0;
	}
	Room(int a, String b, double c)
	{
		roomNo = a;
		roomType = b;
		roomArea = c;
	}
	void displayDetails()
	{
		System.out.println("Room no:: "+roomNo+"\nRoom type:: "+roomType+"\nRoom area:: "+roomArea);
	}
}
class P6
{
	public static void main(String[] args)
	{
		Room r1 = new Room();
		Room r2 = new Room(10,"Living Room",120.0);
		r1.displayDetails();
		r2.displayDetails();
	}
}