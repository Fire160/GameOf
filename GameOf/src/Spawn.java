import java.util.ArrayList;

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
		System.out.println("You dig in the soft ground of the clearing.");
		person.addInventory(loots); 
		}
	}
