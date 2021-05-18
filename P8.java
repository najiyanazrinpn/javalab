class Cpu
{
	static float price = 500;
	class Processor
	{
		int no_of_cores;
		String manufacturer;
		Processor(int n, String m)
		{
			no_of_cores = n;
			manufacturer = m;
		}
		public void display()
		{
			System.out.println("\n\tCPU:\nPrice: "+price+"\nProcessors:\nNumber of cores: "+no_of_cores+"\nManufacturer: "+manufacturer);
		}
	}
	static class Ram
	{
		int memory;
		String manufacturer;
		Ram(int mem, String man)
		{
			memory = mem;
			manufacturer = man;
		}
		public void display()
		{
			System.out.println("\n\tCPU:\nPrice: "+price+"\nRAM:\nMemory: "+memory+"\nManufacturer: "+manufacturer);
		}
	}
}
class P8
{
	public static void main(String[] args)
	{
		Cpu cpu = new Cpu();
		System.out.println("\n"+cpu.price);
		Cpu.Processor pro = cpu.new Processor(4,"Intel");
		pro.display();
		Cpu.Ram ram = new Cpu.Ram(64,"Asus");
		ram.display();
	}
}