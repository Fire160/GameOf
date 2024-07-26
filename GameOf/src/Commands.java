//import java.util.ArrayList;

public class Commands
	{
	public static void takeCommand(String command)
		{
//		String first = cutter(command);
		switch (command.substring(0, 2)) 
			{
			case "at": //attack
				{MainMethod.cords.get(GameCommands.findSquare()).attack(); break;}
			case "br": //breakdance
				{MainMethod.cords.get(GameCommands.findSquare()).breakDance(); break;}
			case "di": //dig
				{MainMethod.cords.get(GameCommands.findSquare()).dig(checkFor("shovel")); break;}
			case "en": //enter
				{MainMethod.cords.get(GameCommands.findSquare()).enter(); break;}
			case "eq": //equip
				{equip(command); break;}
			case "ex": //exit
				{exit(); break;}
			case "he": //help
				{help(); break;}
			case "in": //inventory
				{MainMethod.person.printInventory(); break;}
			case "ma": //map
				{GameOfMaps.PrintMap(); break;}
			case "mo": //move
				{GameOfMoving.move(command, MainMethod.person); break;}
			case "wa": //walk
				{GameOfMoving.move(command, MainMethod.person); break;}
			case "se": //search
				{MainMethod.cords.get(GameCommands.findSquare()).search(); break;}
			case "st": //status
				{status(); break;}
			case "un": //unequip
				{unequip(command); break;}
			case "us": //use
				{use(command); break;}
			case "ea": //eat
				{eat(command); break;}
			default:
				{System.out.println("Sorry, not a valid command. Type help for a list of commands.");}
			}
		}
	private static void eat(String command)
		{
		int result = parseInv(command);
		if(result < 0)
			{
			System.out.println("You own nothing with this name.");
			}
		else if(!MainMethod.person.getInventory().get(result).type.equals("f"))
			{
			System.out.println("You can't eat a " + MainMethod.person.getInventory().get(result).name + "!");
			}
		else
			{
			((FoodItem) MainMethod.person.getInventory().get(result)).eat(result);
			}
		}
	private static void use(String command)
		{
		int result = parseInv(command);
		if(checkWeapon(command))
			{
			MainMethod.person.geteWeapon().use();
			}
		else if(result < 0)
			{
			System.out.println("You own nothing with this name.");
			}
		else
			{
			MainMethod.person.getInventory().get(result).use();
			}
		}
	private static boolean checkFor(String s)
		{
		int result = parseInv(s);
		if(checkWeapon(s) || result > -1)
			{
			return true;
			}
		return false;
		}
	private static void exit()
		{
		System.out.println("You drift off to sleep, and all fades into oblivion.");
		MainMethod.person.setHealth(0);
		}
	private static void status()
		{
		System.out.println("+----(" + MainMethod.person.getName() + "'s Status)----+");
		System.out.println("CURRET HEALTH: " + MainMethod.person.getHealth());
		System.out.println("EQUIPED WEAPON: " + MainMethod.person.geteWeapon().name + " DAMAGE: " + MainMethod.person.geteWeapon().attack);
		}
	private static void equip(String command)
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
//	private static String cutter(String command) //Returns the part of a string before the first space.
//		{
//		String cut = "";
//		if(!command.isEmpty() && command.contains(" "))
//			{
//			cut = command.substring(0,command.indexOf(" "));
//			}
//		return cut;
//		}
	public static void help()
		{
		System.out.println("+-------------------------(HELP)-------------------------+");
		System.out.println("attack <target>: Attacks the target with current weapon. If no valid target is selected, valid targets will be listed.");
		System.out.println("breakdance: Pull some sick moves!");
		System.out.println("dig: Dig around the area with your current weapon.");
		System.out.println("eat: Eat a food item.");
		System.out.println("equip <weapon in inventory>: Equips the specified weapon.");
		System.out.println("enter: Attempt to enter a building in the area.");
		System.out.println("exit: Leave the adventure to a better man.");
		System.out.println("help: Shows this screen.");
		System.out.println("inventory: Shows your inventory.");
		System.out.println("map: Displays the map.");
		System.out.println("move <direction> || walk <direction>: Moves you in the specified direction.");
		System.out.println("search: Search the area.");
		System.out.println("status: Shows your health and equiped weapon.");
		System.out.println("unequip: Unequips your current weapon");
		System.out.println("use <item>: Uses the item in the current area.");
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
	public static boolean checkWeapon(String c)
		{
		if(c.contains(MainMethod.person.geteWeapon().name.toLowerCase()))
			{return true;}
		return false;
		}
	public static void unequip(String command)
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
	}
