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
		GameOfMaps.MapMaker();
		Player person = new Player(name);
		while(running == true)
			{
			GameOfMaps.PrintMap();
			System.out.println("What do you do now?");
			running = false;
			}
		things.close();
		}
	}
