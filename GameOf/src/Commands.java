import java.util.ArrayList;

public class Commands
	{
	public static void takeCommand(String command, int cord)
		{
		if(command.contains("move") || command.contains("walk"))
			{
			GameOfMoving.move(command, MainMethod.person);
			}
		else if(command.contains("help"))
			{
			help();
			}
		else if(command.contains("search"))
			{
			MainMethod.cords.get(cord).search();
			}
		else if(command.contains("map"))
			{
			GameOfMaps.PrintMap();
			}
		else if(command.contains("unequip"))
			{
			if(MainMethod.person.geteWeapon().name.contains("Fists"))
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
			GameOfMaps.PrintMap();
			}
		else if(command.contains("status") || command.contains("stats") || command.contains("stat"))
			{
			System.out.println("+----(" + MainMethod.person.getName() + "'s Status)----+");
			System.out.println("CURRET HEALTH: " + MainMethod.person.getHealth());
			System.out.println("EQUIPED WEAPON: " + MainMethod.person.geteWeapon().name + " DAMAGE: " + MainMethod.person.geteWeapon().attack);
			}
		else if(command.contains("inventory") || command.contains("inven"))
			{
			System.out.println("+---------(" + MainMethod.person.getName() + "'s INVENTORY)---------+");
			MainMethod.person.printInventory();
			}
		else if(command.contains("dig"))
			{
			MainMethod.cords.get(cord).dig();
			}
		else if(command.contains("use"))
			{
			boolean found = false;
			int tracker = -1;
			for(int i = 0; i < MainMethod.person.getInventory().size(); i++)
				{
				if(command.contains(MainMethod.person.getInventory().get(i).name.toLowerCase()))
					{
					found = true;
					tracker = i;
					}
				}
			if(found == true)
				{
				MainMethod.person.getInventory().get(tracker).use();
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
