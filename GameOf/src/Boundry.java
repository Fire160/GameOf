public class Boundry extends MapSquare
	{
	public Boundry(int i, int o)
		{
		x = i;
		y = o;
		position = "B";
		loots = new RealItem("","",0);
		}
	protected void run()
		{
		System.out.println("YOU HAVE COME TO THE EDGE, THERE IS NOTHING FOR YOU HERE!");
		isFound = true;
		}
	protected void generateLoot()
		{
		}
	protected void dig(Player person)
		{
		
		}
	}
