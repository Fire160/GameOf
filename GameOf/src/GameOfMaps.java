import java.util.ArrayList;

public class GameOfMaps
	{
	public static ArrayList<MapSquare> MapMaker()
		{
		ArrayList<MapSquare> cords = new ArrayList<MapSquare>();
		for(int q = 0; q < 7; q++)
			{
			for(int w = 0; w < 7; w++)
				{
				if((q == 3) && (w == 3))
					{
					cords.add(new Spawn(q , w));
					}
				else if(q == 0 || q == 6 || w == 0 || w == 6)
					{
					cords.add(new Boundry(q , w));
					}
				else
					{
					int random = (int) (Math.random() * 5);
					if(random == 1 || random == 0)
						{
						cords.add(new Forest( q , w ));
						}
					else if(random == 2)
						{
						cords.add(new Forest( q , w ));
						}
					else if(random == 3)
						{
						cords.add(new Lake( q , w ));
						}
					else
						{
						cords.add(new Dungeon( q , w ));
						}
					}
				}
			}
		return cords;
		}
	public static void PrintMap(ArrayList<MapSquare> cords)
		{
		System.out.println("       +----(MAP)----+");
		System.out.println("+---+---+---+---+---+---+---+");
		for(int i = 0; i < cords.size(); i++)
			{
			if(cords.get(i).isFound() == false)
				{
				if(i %7 == 6)
					{
					System.out.println("| ? | ");
					System.out.println("+---+---+---+---+---+---+---+");
					}
				else
					{
					System.out.print("| ? ");
					}
				}
			else
				{
				if(i %7 == 6)
					{
					System.out.println("| " + cords.get(i).getPosition() + " | ");
					System.out.println("+---+---+---+---+---+---+---+");
					}
				else
					{
					System.out.print("| " + cords.get(i).getPosition() + " ");
					}
				}
			}
//		System.out.println(" _____");
//		System.out.println("|  N/ |");
//		System.out.println("|W O E|");
//		System.out.println("|__S__|");
		}
	}
