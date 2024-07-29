import java.util.ArrayList;
import java.util.Scanner;

public class MainMethod
	{
	public static boolean running;
	public static ArrayList<MapSquare> cords = GameOfMaps.MapMaker();
	public static Player person = new Player("Default");
	public static void main(String[] args)
		{
		running = true;
		Scanner things = new Scanner(System.in);
		System.out.println("TYPE YOUR NAME TO BEGIN!");
		String name = things.nextLine();
		System.out.println("FOR A LIST OF COMMANDS TYPE 'help'");
		person.setName(name);
		while(running && person.getHealth() > 0)
			{
			int cord = GameCommands.findSquare();
			System.out.println("HIT ENTER TO CONTINUE");
			things.nextLine();
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
			cords.get(cord).run();
			System.out.println("WHAT DO YOU DO NOW?");
			Commands.takeCommand(things.nextLine().toLowerCase());;
			}
		if(person.getHealth() < 1)
			{
			System.out.println("You died in a harsh world.");
			}
		things.close();
		}
	}
