
public class Commands
	{
	public static void takeCommand(String command, Player person)
		{
		GameOfMoving.move(command, person.getX(), person.getY());
		}
	}
