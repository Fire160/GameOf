import java.util.Scanner;

public class MainMethod
	{
	public static void main(String[] args)
		{
		Scanner things = new Scanner(System.in);
		GameOfMaps.MapMaker();
		GameOfMaps.PrintMap();
		things.close();
		}
	}
