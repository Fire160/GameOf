import java.util.ArrayList;

public class Lake extends MapSquare
	{
	public Lake(int i, int o)
		{
		x = i;
		y = o;
		position = "L";
		}
	public void run()
		{
		if(isFound == false)
			{
			System.out.println("You stand on the edge of a small lake.");
			isFound = true;
			}
		else
			{
			System.out.println("You stand on the edge of a small lake.");
			}
		}
	protected void generateLoot()
		{
		ArrayList<Item> temp = new ArrayList<Item>();
		temp.add(new FoodItem("Berry","A delicious looking berry. But looks can be decieving.",0, 10));
		temp.add(new FoodItem("Berry","A delicious looking berry. But looks can be decieving",0, -20));
		temp.add(new Weapon("Wet Stick","A wet wood stick, it's kinda sticky.",1,2));
		int rando = (int) (Math.random() * 3);
		loots = (Item) temp.get(rando);
		}
	public void dig()
		{
		System.out.println("You start digging a hole, but it fills with water quickly!");
		}
	public void use(String name)
		{
		if(name.equals("Scuba Gear"))
			{
			System.out.println("You dive deep into the depths of the lake where you find a " + loots.name);
			}
		}
	public void attack()
		{
		System.out.println("I'm working on it! Keep calm and come back later!");
		}
	public void search()
		{
		System.out.println("You see many shadows moving in the water, but they are very deep.");
		System.out.println("You would run out of air if you tried to ENTER the water.");
		}
	protected void enter()
		{
		System.out.println("You enter the water, and a mysterious force compels you to continue walking toward the center.");
		System.out.println("You quickly drown.");
		MainMethod.person.setHealth(0);
		}
	}