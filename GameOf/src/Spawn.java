public class Spawn extends MapSquare
	{
	public Spawn(int i, int o)
		{
		x = i;
		y = o;
		position = "S";
		}
	protected void run()
		{
		if(isFound == false)
			{
			System.out.println("You wake up in a clearing surrounded by trees.");
			System.out.println("You have no recolection of how you got here.");
			System.out.println("Light streams down all around you.");
			isFound = true;
			}
		else
			{
			System.out.println("You stand in the clearing you woke up in.");
			}
		}
	}
