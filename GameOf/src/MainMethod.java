import java.util.ArrayList;
import java.util.Scanner;

public class MainMethod
	{
	public static boolean running;
	public static void main(String[] args)
		{
		running = true;
		Scanner things = new Scanner(System.in);
		System.out.println("TYPE YOUR NAME TO BEGIN!");
		String name = things.nextLine();
		System.out.println("FOR A LIST OF COMMANDS TYPE 'help'");
		ArrayList<MapSquare> cords = GameOfMaps.MapMaker();
		Player person = new Player(name);
		while(running == true && person.getHealth() > 0)
			{
			int cord = GameCommands.findSquare(person, cords);
			cords.get(cord).run();
			System.out.println("What do you do now?");
			Commands.takeCommand(things.nextLine().toLowerCase(), person, cords, cord);;
			}
		if(person.getHealth() < 1)
			{
			System.out.println("You died in a harse world.");
			}
		things.close();
		}
	}
