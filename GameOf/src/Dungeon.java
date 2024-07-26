public class Dungeon extends MapSquare
	{
	protected static boolean isSlain;
	public Dungeon(int i, int o)
		{
		x = i;
		y = o;
		position = "D";
		isSlain = false;
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
			if(isSlain)
				{
				System.out.println("There is an errie silence around the dungeon now.");
				}
			else
				{
				System.out.println("You stand outside a spooky dungeon. It's still being built by monsters. They are looking at you now.");
				}
			}
		}
	protected void generateLoot()
		{
		Weapon temp = new Weapon("Shovel","Great for digging a grave and making it's occupants.",0, 10);
		loots = temp;
		}
	public void dig(boolean shovel)
		{
		if(isSlain)
			{
			System.out.println("You decide to dig some graves for the monsters. It isn't right to leave that kind of filth out. You only get through a few.");
			}
		else
			{
			System.out.println("You decide to give the monsters a hand.");
			System.out.println("As you get closer the blood dripping from their jowls makes you reconsider.");
			if(shovel)
				{
				System.out.println("They notice you have one of their shovels, and they are not happy about it.");
				}
			}
		}
	public void use(String name)
		{
		System.out.println("You try to use the " + name + " but give up after realizing it was a stupid idea.");
		}
	public void attack()
		{
		if(isSlain)
			{
			System.out.println("They're already dead. All of them.");
			}
		else if(MainMethod.person.geteWeapon().attack > 100)
			{
			System.out.println("You mow down wave after wave of terrfying monsters with your mighty gun. They never stood a chance against such a weapon.");
			isSlain = true;
			}
		else
			{
			System.out.println("You charge at the monsters, and using your " + MainMethod.person.geteWeapon().name + " you manage to kill one or two.");
			System.out.println("However, they are unphased, and you are quickly overcome.");
			MainMethod.person.setHealth(0);
			}
		}
	public void search()
		{
		if(isLooted == false)
			{
			System.out.println("While the monsters are on a lunch break you steal one of their shovels.");
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
		if(isSlain)
			{
			System.out.println("You find a note:");
			System.out.println("   Dear Fellow Thief,");
			System.out.println("Sorry you had to go through the trouble of traversing what I am sure will be a vast dungeon, but I, Mask De Maske, ");
			System.out.println("The World's Greatest Thief, have stolen the Muguffin before the dastardly monsters even finished the dungeon. By now");
			System.out.println("I am relaxing by the lakeside, enjoying a cool dip in the refreshing water.");
			System.out.println("         Better Luck Next Time,");
			System.out.println("                  Mask De Maske");
			}
		else
			{
			System.out.println("It is probably unwise to try to enter the dungeon, given all the monsters around.");
			}
		}
	}
