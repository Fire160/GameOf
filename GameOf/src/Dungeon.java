public class Dungeon extends MapSquare
	{
	public Dungeon(int i, int o)
		{
		x = i;
		y = o;
		position = "D";
		}
	protected void run()
		{
		if(isFound == false)
			{
			System.out.println("You stand outside a spooky dungeon. It's still being built by monsters.");
			isFound = true;
			}
		else
			{
			System.out.println("You stand outside a spooky dungeon. It's still being built by monsters.");
			}
		}
	}
