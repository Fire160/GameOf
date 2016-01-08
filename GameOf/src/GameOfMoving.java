public class GameOfMoving
	{
	public static void move(String command, Player person)
		{
		int x = person.getX();
		int y = person.getY();
		if(command.contains("north"))
			{
			if(x == 0)
				{
				System.out.println("You can't climb the border!");
				}
			else
				{
				person.setX(x - 1);
				System.out.println("YOU HEAD NORTH!");
				}
			}
		else if(command.contains("south"))
			{
			if(x == 6)
				{
				System.out.println("You can't climb the border!");
				}
			else
				{
				person.setX(x + 1);
				System.out.println("YOU HEAD SOUTH!");
				}
			}
		else if(command.contains("west"))
			{
			if(y == 0)
				{
				System.out.println("You can't climb the border!");
				}
			else
				{
				person.setY(y - 1);
				System.out.println("YOU HEAD WEST!");
				}
			}
		else if(command.contains("east"))
			{
			if(y == 6)
				{
				System.out.println("You can't climb the border!");
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
	}
