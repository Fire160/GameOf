//import java.util.ArrayList;

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
				MainMethod.person.addInventory(MainMethod.person.geteWeapon());
				MainMethod.person.seteWeapon(new Weapon("Fists", "I don't know how these are in your inventory, soo that's a thing.", 1, 1));
				}
			}
		else if(command.contains("equip"))
			{
			boolean equiped = false;
			for(int i = 0; i < MainMethod.person.getInventory().size(); i++)
				{
				if(command.contains(MainMethod.person.getInventory().get(i).name.toLowerCase()))
					{
					if(MainMethod.person.getInventory().get(i).type.equals("w"))
						{
						MainMethod.person.seteWeapon((Weapon) MainMethod.person.getInventory().get(i));
						System.out.println("You equiped the " + MainMethod.person.getInventory().get(i).name + ".");
						MainMethod.person.getInventory().remove(i);
						}
					else
						{
						System.out.println("That is not a weapon.");
						}
					i = MainMethod.person.getInventory().size();
					equiped = true;
					}
				}
			if(!equiped)
				{
				System.out.println("You own nothing with this name.");
				}
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
		else if(command.contains("exit"))
			{
			System.out.println("You drift off to sleep, and all fades into oblivion.");
			MainMethod.person.setHealth(0);
			}
		else if(command.contains("use"))
			{
			int result = parseInv(command);
			if(result < 0)
				{
				System.out.println("You own nothing with this name.");
				}
			else
				{
				MainMethod.person.getInventory().get(result).use();
				}
			}
		else if(command.contains("eat"))
			{
			int result = parseInv(command);
			if(result < 0)
				{
				System.out.println("You own nothing with this name.");
				}
			if(!MainMethod.person.getInventory().get(result).type.equals("f"))
				{
				System.out.println("You can't eat a " + MainMethod.person.getInventory().get(result).name + "!");
				}
			else
				{
				((FoodItem) MainMethod.person.getInventory().get(result)).eat(result);
				}
			}
		else if(command.contains("attack"))
			{
			MainMethod.cords.get(GameCommands.findSquare()).attack();
			}
		else if(command.contains("enter"))
			{
			MainMethod.cords.get(GameCommands.findSquare()).enter();
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
		System.out.println("search: Search the area.");
		System.out.println("equip <weapon in inventory>: Equips the specified weapon");
		System.out.println("help: Shows this screen");
		System.out.println("inventory: Shows your inventory");
		System.out.println("map: Displays the map");
		System.out.println("move <direction> || walk <direction>: Moves you in the specified direction");
		System.out.println("unequip: Unequips your current weapon");
		System.out.println("use <item>: Uses the item in the current area.");
		System.out.println("eat: Eat a food item.");
		System.out.println("status: Shows your health and equiped weapon");
		System.out.println("attack <foe>: Attacks with current weapon.");
		System.out.println("exit: Leave the adventure to a better man.");
		}
	public static int parseInv(String c)
		{
		for(int i = 0; i < MainMethod.person.getInventory().size(); i++)
			{
			if(c.contains(MainMethod.person.getInventory().get(i).name.toLowerCase()))
				{
				return i;
				}
			}
		return -1;
		}
	}
