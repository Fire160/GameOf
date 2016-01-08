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
		ArrayList<MapSquare> cords = GameOfMaps.MapMaker();
		Player person = new Player(name);
		person.addInventory(new RealItem("Nothing",":(",0));
		while(running == true)
			{
			int cord = GameCommands.findSquare(person, cords);
			cords.get(cord).run();
			System.out.println("What do you do now?");
			Commands.takeCommand(things.nextLine().toLowerCase(), person, cords);;
			}
		things.close();
		}
	}
