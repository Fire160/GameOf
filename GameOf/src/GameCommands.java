import java.util.ArrayList;

public class GameCommands
	{
	public static int findSquare(Player person, ArrayList<MapSquare> cords)
		{
		int finder = 24;
		for(int i = 0; i < cords.size(); i++)
			{
			if(person.getX() == cords.get(i).getX() && person.getY() == cords.get(i).getY())
				{
				finder = i;
				}
			}
		return finder;
		}
	}
