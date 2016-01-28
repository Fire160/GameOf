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
			System.out.println("You stand in a forest. You hear birds chirping.");
			}
		}
	protected void generateLoot()
		{
		ArrayList<Item> temp = new ArrayList<Item>();
		temp.add(new RealItem("Scuba Gear","Diving gear, great for diving or ENTERing",30));
		temp.add(new Weapon("A Gun","Striaght out of compton",45, 600));
		temp.add(new Weapon("Stick","A wood stick....",3,2));
		int rando = (int) (Math.random() * 3);
		loots = (Item) temp.get(rando);
		}
	public void dig()
		{
		System.out.println("You dig a random forest hole.. but the ground is too tough to make any real progress.");
		}
	public void use(String name)
		{
		if(name.equals("Shovel") && isLooted == false)
			{
			System.out.println("You dug with the shovel.");
			MainMethod.person.addInventory(loots);
			isLooted = true;
			}
		else
			{
			System.out.println("There is nothing else to do here.");
			}
		}
	public void attack()
		{
		System.out.println("There is nothing to attack so you put down your weapon and contemplate life.");
		}
	public void search()
		{
		
		}
	protected void enter()
		{
		
		}
	}
