class Product
{
	// public:
		String pCode, pName;
		double price;
		void getData(String code, String name, double p)
		{
			pCode = code;
			pName = name;
			price = p;
		}
		void putData()
		{
			System.out.println("Product code: "+pCode+"\nProduct name: "+pName+"\nPrice: "+price);
		}
}
public class P2
{
	public static void main(String[] args)
	{
		Product p1 = new Product();
		p1.getData("P01", "Pen", 20.0);
		Product p2 = new Product();
		p2.getData("P02", "Book", 40.0);
		Product p3 = new Product();
		p3.getData("P03", "Eraser", 5.0);

		if((p1.price<p2.price)&&(p1.price<p3.price))
		{
			System.out.println("Product1 has lesser price");
			p1.putData();
		}
		else if(p2.price<p3.price)
		{
			System.out.println("Product2 has lesser price");
			p2.putData();
		}
		else
		{
			System.out.println("Product3 has lesser price");
			p3.putData();
		}
	}
}