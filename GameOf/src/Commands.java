import java.util.ArrayList;

public class Commands
	{
	public static void takeCommand(String command, Player person, ArrayList<MapSquare> cords)
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
		else if(command.contains("inventory"))
			{
			System.out.println("+---------(" + person.getName() + "'s INVENTORY)---------+");
			person.printInventory();
			}
		else
			{
			System.out.println("Sorry, not a valid command. Type help for a list of commands.");
			}
		}
	public static void help()
		{
		System.out.println("+-------------------------(HELP)-------------------------+");
		System.out.println("equip <weapon in inventory>: Equips the specified weapon");
		System.out.println("help: Shows this screen");
		System.out.println("map: Displays the map");
		System.out.println("move <direction> || walk <direction>: Moves you in the specified direction");
		System.out.println("unequip: Unequips your current weapon");
		System.out.println("status: Shows your health and equiped weapon");
		}
	}
