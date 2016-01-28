public class GameCommands
	{
	public static int findSquare()
		{
		int finder = 24;
		for(int i = 0; i < MainMethod.cords.size(); i++)
			{
			if(MainMethod.person.getX() == MainMethod.cords.get(i).getX() && MainMethod.person.getY() == MainMethod.cords.get(i).getY())
				{
				finder = i;
				}
			}
		return finder;
		}
	}
