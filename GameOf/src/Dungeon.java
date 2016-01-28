import java.util.ArrayList;

public class Dungeon extends MapSquare
	{
	public Dungeon(int i, int o)
		{
		x = i;
		y = o;
		position = "D";
		}
	public void run()
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
	protected void generateLoot()
		{
		Weapon temp = new Weapon("Shovel","Great for digging a grave and making it's occupants.",0, 10);
		loots = temp;
		}
	public void dig()
		{
		System.out.println("You give the monsters a hand.");
		System.out.println("They start moving towards you menecingly and you decide that was a bad call so you run.");
		}
	public void use(String name)
		{
		
		}
	public void attack()
		{
		
		}
	public void search()
		{
		if(isLooted == false)
			{
			System.out.println("While on their lunch break you steal a monsters shovel.");
			MainMethod.person.addInventory(loots);
			isLooted = true;
			}
		else
			{
			System.out.println("There is nothing else useful here.");
			}
		}
	public void enter()
		{
		
		}
	}
