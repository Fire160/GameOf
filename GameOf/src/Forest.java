import java.util.ArrayList;

public class Forest extends MapSquare
	{
	public Forest(int i, int o)
		{
		x = i;
		y = o;
		position = "F";
		}
	public void run()
		{
		if(isFound == false)
			{
			System.out.println("You stand in a forest. You hear birds chirping.");
			isFound = true;
			}
		else
			{
			System.out.println("You stand in a forest. It is silent. You feel uneasy.");
			}
		}
	protected void generateLoot()
		{
		ArrayList<Item> temp = new ArrayList<Item>();
		temp.add(new RealItem("Scuba Gear","Diving gear, great for diving or ENTERing",30));
		temp.add(new Weapon("Literal Gun","Just a straight up firearm, you could do some damage with this.",45, 600));
		temp.add(new Weapon("Stick","A very sticky item.",3,2));
		int rando = (int) (Math.random() * 3);
		loots = (Item) temp.get(rando);
		}
	public void dig()
		{
		System.out.println("You try to dig a hole, but the ground is too tough to make any real progress.");
		}
	public void use(String name)
		{
		if(name.equals("Shovel") && !isLooted)
			{
			System.out.println("You dug with the shovel and found " + loots.name + ".");
			MainMethod.person.addInventory(loots);
			isLooted = true;
			}
		else if(isLooted)
			{
			System.out.println("There is nothing else to do here.");
			}
		else
			{
			System.out.println("There is nothing to do with the " + name + " here.");
			}
		}
	public void attack()
		{
//		System.out.println("There is nothing to attack so you put down your weapon and contemplate life.");
		System.out.println("You attack the nearest tree, leaving the bark scared. Now the other trees know to leave you alone.");
		}
	public void search()
		{
		int rando = (int) (Math.random() * 10);
		if(rando == 9)
			{
			System.out.println("You venture deep into the trees, it gets dark, and you feel you are being watched.");
			System.out.println("You hear a quiet sharp noise, and suddenly you're looking up at your body, watching it fall over, headless.");
			MainMethod.person.setHealth(0);
			}
		else
			{
			System.out.println("You wander off, and quickly get lost. Somehow, you manage to find the path again. Best not do that again.");
			}
		}
	protected void enter()
		{
		System.out.println("There's no where to go.");
		}
	}
