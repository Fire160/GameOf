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
			System.out.println("You stand on the edge of a small lake. You notice a putrid smell in the air.");
			}
		}
	protected void generateLoot()
		{
		ArrayList<Item> temp = new ArrayList<Item>();
//		temp.add(new FoodItem("Frog","I got a frog in my pocket.",30, 10));
		temp.add(new RealItem("Maguffin","Some sort of strange bird shapped key.",0));
//		temp.add(new Weapon("Wet Stick","A wet wood stick, it's kinda sticky.",1,2));
		int rando = (int) (Math.random() * 1);
		loots = (Item) temp.get(rando);
		}
	public void dig(boolean shovel)
		{
		if(shovel)
			{System.out.println("You use your shovel to dig a deep hole, which fills almost instantly with water.");}
		else
			{System.out.println("You start digging a hole, but it fills with water quickly!");}
		}
	public void use(String name)
		{
		if(name.equals("Scuba Gear"))
			{
			enter();
			}
		else
			{
			System.out.println("You aren't quite sure what you wanted to accomplish with the " + name + " and decide to stare at it for a few minutes.");
			}
		}
	public void attack()
		{
		System.out.println("You let loose your mighty " + MainMethod.person.geteWeapon().name + " upon the deep water. The water shutters and trembles in fear of your power!");
		}
	public void search()
		{
		System.out.println("You see many shadows moving in the water, but they are very deep.");
		System.out.println("You would run out of air if you tried to ENTER the water.");
		}
	protected void enter()
		{
		if(isLooted)
			{
			System.out.println("You wouldn't go back in that water even if you had an army behind you.");
			}
		else if(Commands.checkFor("scuba gear"))
			{
			System.out.println("You dive deep into the depths of the lake. A mysterious power draws you toward the center of the lake.");
			System.out.println("As you swim, you notice many skeletons, including one with a large colorful hat, and mask.");
			System.out.println("You find a " + loots.name + " as you swim by.");
			MainMethod.person.addInventory(loots);
			isLooted = true;
			System.out.println("At the center you find a hidious creature, a foul misshapen mermaid with a hundred eyes. It whispers your name enchantingly, and the world becomes blurry.");
			System.out.println("As a slimy tentacles begins to wrap around your leg, you regain your senses, and wield your mighty " + MainMethod.person.geteWeapon().name + "!");
			if(MainMethod.person.geteWeapon().attack > 9)
				{
				System.out.println("You slay the disgusting beast, and swim as fast as you can out of the deep dark waters.");
				System.out.println("You flop out onto the shore, gasping for breath.");
				}
			else
				{
				System.out.println("Sadly your weapon is too weak, and this creature wraps its oily tentacles around you, pulling your scuba gear off, and pressing its twisted lips to yours.");
				System.out.println("As you lose the last bit of air in your body, the world becomes dark and blurry again.");
				MainMethod.person.setHealth(0);
				}
			}
		else
			{
			System.out.println("You enter the water, and a mysterious force compels you to continue walking toward the center.");
			System.out.println("You quickly drown.");
			MainMethod.person.setHealth(0);
			}
		}
	protected void makeCharacters()
		{
		
		}
	}