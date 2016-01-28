import java.util.ArrayList;

public class Spawn extends MapSquare
	{
	protected boolean isOpen;
	public Spawn(int i, int o)
		{
		x = i;
		y = o;
		position = "S";
		}
	public void run()
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
		temp.add(new FoodItem("Spud","A delicious looking potato. But looks can be decieving.",0, 10));
		temp.add(new FoodItem("Spud","A delicious looking potato. But looks can be decieving",0, -20));
		temp.add(new Weapon("Stick","A wood stick....",3,2));
		int rando = (int) (Math.random() * 3);
		loots = (Item) temp.get(rando);
		}
	public void dig(Player person)
		{
		System.out.println("You dig in the soft ground of the clearing.");
		person.addInventory(loots); 
		}
	
	public void use(String name)
		{
		if(name.equals("Maguffin"))
			{
			System.out.println("You place the key into the hole in the center of the clearing!");
			System.out.println("The ground rumbles.");
			System.out.println("A staircase appears in the soft ground leading to a dark tunnel.");
			}
		}
	public void attack()
		{
		
		}
	
	public void dig()
		{
		
		}
	public void search()
		{
		
		}
	public void enter()
		{
		
		}
	}
