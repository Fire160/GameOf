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
		temp.add(new Weapon("Stick","A wood stick.",3,2));
		temp.add(new Weapon("Stick","A nice wood stick.",4,3));
		int rando = (int) (Math.random() * 4);
		loots = (Item) temp.get(rando);
		}
	public void dig()
		{
		if(!isLooted)
			{
			System.out.println("You dig in the soft ground of the clearing.");
			MainMethod.person.addInventory(loots); 
			isLooted = true;
			}
		else
			{
			System.out.println("You already dug a hole here.");
			}
		}
	public void use(String name)
		{
		if(name.equals("maguffin"))
			{
			System.out.println("You place the key into the shrine in the center of the clearing!");
			System.out.println("The ground rumbles.");
			System.out.println("A staircase appears in the soft ground leading to a dark tunnel.");
			}
		else
			{
			System.out.println("The " + name + " doesn't seem to do anything here.");
			}
		}
	public void attack()
		{
		System.out.println("You hit the mysterious shrine with " + MainMethod.person.geteWeapon().name + ", but alas, it remains.");
		}
	public void search()
		{
		if(isLooted)
			{
			System.out.println("There is a small hole in the ground where you dug. You don't much feel like digging more here.");
			}
		else
			{
			System.out.println("The ground is soft here and could easily be dug up with only your hands.");
			}
		System.out.println("There is a small shrine in the middle of the clearing. It has a keyhole in the center.");
		}
	public void enter()
		{
		
		}
	}
