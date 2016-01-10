import java.util.ArrayList;

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
	protected void generateLoot()
		{
		ArrayList<Item> temp = new ArrayList<Item>();
		temp.add(new FoodItem("Berry","A delicious looking berry. But looks can be decieving.",0, 10));
		temp.add(new FoodItem("Berry","A delicious looking berry. But looks can be decieving",0, -20));
		temp.add(new Weapon("Stick","A wood stick....",3,2));
		int rando = (int) (Math.random() * 3);
		loots = (Item) temp.get(rando);
		}
	protected void dig(Player person)
		{
		System.out.println("You give the monsters a hand.");
		System.out.println("They start moving towards you and you decide that was a bad call so you run.");
		}
	}
