import java.util.ArrayList;

public class Commands
	{
	public static void takeCommand(String command, Player person, ArrayList<MapSquare> cords, int cord)
		{
		if(command.contains("move") || command.contains("walk"))
			{
			GameOfMoving.move(command, person);
			}
		else if(command.contains("help"))
			{
			help();
			}
		else if(command.contains("map"))
			{
			GameOfMaps.PrintMap(cords);
			}
		else if(command.contains("unequip"))
			{
			if(person.geteWeapon().name.contains("Fists"))
				{
				System.out.println("You're not holding a weapon!");
				}
			else
				{
				System.out.println("I'll be straight with you. This is harder than you think.");
				}
			}
		else if(command.contains("equip"))
			{
			System.out.println("Stuff");
			GameOfMaps.PrintMap(cords);
			}
		else if(command.contains("status") || command.contains("stats") || command.contains("stat"))
			{
			System.out.println("+----(" + person.getName() + "'s Status)----+");
			System.out.println("CURRET HEALTH: " + person.getHealth());
			System.out.println("EQUIPED WEAPON: " + person.geteWeapon().name + " DAMAGE: " + person.geteWeapon().attack);
			}
		else if(command.contains("inventory") || command.contains("inven"))
			{
			System.out.println("+---------(" + person.getName() + "'s INVENTORY)---------+");
			person.printInventory();
			}
		else if(command.contains("dig"))
			{
			if(cords.get(cord).isLooted == false)
				{
				cords.get(cord).dig(person);
				cords.get(cord).setLooted(true);
				}
			else
				{
				System.out.println("You already dug here.");
				}
			}
		else if(command.contains("use"))
			{
			boolean found = false;
			int tracker = -1;
			for(int i = 0; i < person.getInventory().size(); i++)
				{
				if(command.contains(person.getInventory().get(i).name.toLowerCase()))
					{
					found = true;
					tracker = i;
					}
				}
			if(found == true)
				{
				person.getInventory().get(tracker).use(person);
				}
			else
				{
				System.out.println("You own nothing with this name John Snow.");
				}
			}
		else
			{
			System.out.println("Sorry, not a valid command. Type help for a list of commands.");
			}
		}
	public static void help()
		{
		System.out.println("+-------------------------(HELP)-------------------------+");
		System.out.println("dig: Dig around the area with your current weapon.");
		System.out.println("equip <weapon in inventory>: Equips the specified weapon");
		System.out.println("help: Shows this screen");
		System.out.println("inventory: Shows your inventory");
		System.out.println("map: Displays the map");
		System.out.println("move <direction> || walk <direction>: Moves you in the specified direction");
		System.out.println("unequip: Unequips your current weapon");
		System.out.println("use <item>: Uses the item, eats it if it's food.");
		System.out.println("status: Shows your health and equiped weapon");
		}
	}
