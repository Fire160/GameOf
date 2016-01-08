
public class Commands
	{
	public static void takeCommand(String command, Player person)
		{
		if(command.contains("move"))
			{
			GameOfMoving.move(command, person.getX(), person.getY());
			}
		else if(command.contains("help"))
			{
			help();
			}
		else
			{
			System.out.println("Sorry, not a valid command. Type help for a list of commands.");
			}
		}
	public static void help()
		{
		System.out.println("help: Shows this screen");
		System.out.println("move <direction>: Moves you in the specified direction");
		}
	}
