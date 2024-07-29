public class GameOfMoving
	{
	public static void move(String command, Player person)
		{
		int x = person.getX();
		int y = person.getY();
		String s = lastPart(command).toLowerCase();
		if(s.contains("north"))
			{
			if(x == 0)
				{
				System.out.println("You can't climb the mountains!");
				}
			else
				{
				person.setX(x - 1);
				System.out.println("YOU HEAD NORTH!");
				}
			}
		else if(s.contains("south"))
			{
			if(x == 6)
				{
				System.out.println("You can't climb the mountains!");
				}
			else
				{
				person.setX(x + 1);
				System.out.println("YOU HEAD SOUTH!");
				}
			}
		else if(command.toLowerCase().contains("west"))
			{
			if(y == 0)
				{
				System.out.println("You can't climb the mountains!");
				}
			else
				{
				person.setY(y - 1);
				System.out.println("YOU HEAD WEST!");
				}
			}
		else if(s.contains("east"))
			{
			if(y == 6)
				{
				System.out.println("You can't climb the mountains!");
				}
			else
				{
				person.setY(y + 1);
				System.out.println("YOU HEAD EAST!");
				}
			}
		else
			{
			System.out.println("NO DIRECTION SPECIFIED!");
			}
		}
	public static String lastPart(String s)
		{
		if(s.length() > 0 && s.contains(" "))
			{
			s = s.substring(s.indexOf(" "));
			}
		return s;
		}
	}
