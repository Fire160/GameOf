import java.util.ArrayList;

public class GameOfMaps
	{
	public static ArrayList<MapSquare> MapMaker()
		{
		ArrayList<MapSquare> cords = new ArrayList<MapSquare>();
		//Top Row
		cords.add(new Boundry(0,0));
		cords.add(new Boundry(0,1));
		cords.add(new Boundry(0,2));
		cords.add(new Boundry(0,3));
		cords.add(new Boundry(0,4));
		cords.add(new Boundry(0,5));
		cords.add(new Boundry(0,6));
		//Second Row
		cords.add(new Boundry(1,0));
		cords.add(new Forest(1,1));
		cords.add(new Forest(1,2));
		cords.add(new Forest(1,3));
		cords.add(new Forest(1,4));
		cords.add(new Lake(1,5));
		cords.add(new Boundry(1,6));
		//Third Row
		cords.add(new Boundry(2,0));
		cords.add(new Forest(2,1));
		cords.add(new Forest(2,2));
		cords.add(new Forest(2,3));
		cords.add(new Forest(2,4));
		cords.add(new Lake(2,5));
		cords.add(new Boundry(2,6));
		//Fourth Row
		cords.add(new Boundry(3,0));
		cords.add(new Forest(3,1));
		cords.add(new Forest(3,2));
		cords.add(new Spawn(3,3));
		cords.add(new Dungeon(3,4));
		cords.add(new Lake(3,5));
		cords.add(new Boundry(3,6));
		//Fifth Row
		cords.add(new Boundry(4,0));
		cords.add(new Forest(4,1));
		cords.add(new Forest(4,2));
		cords.add(new Forest(4,3));
		cords.add(new Forest(4,4));
		cords.add(new Lake(4,5));
		cords.add(new Boundry(4,6));
		//Sixth Row
		cords.add(new Boundry(5,0));
		cords.add(new Forest(5,1));
		cords.add(new Forest(5,2));
		cords.add(new Forest(5,3));
		cords.add(new Forest(5,4));
		cords.add(new Lake(5,5));
		cords.add(new Boundry(5,6));
		//Seventh Row
		cords.add(new Boundry(6,0));
		cords.add(new Boundry(6,1));
		cords.add(new Boundry(6,2));
		cords.add(new Boundry(6,3));
		cords.add(new Boundry(6,4));
		cords.add(new Boundry(6,5));
		cords.add(new Boundry(6,6));
//		for(int q = 0; q < 7; q++)
//			{
//			for(int w = 0; w < 7; w++)
//				{
//				if((q == 3) && (w == 3))
//					{
//					cords.add(new Spawn(q , w));
//					}
//				else if(q == 0 || q == 6 || w == 0 || w == 6)
//					{
//					cords.add(new Boundry(q , w));
//					}
//				else
//					{
//					int random = (int) (Math.random() * 5);
//					if(random == 1 || random == 0)
//						{
//						cords.add(new Forest( q , w ));
//						}
//					else if(random == 2)
//						{
//						cords.add(new Forest( q , w ));
//						}
//					else if(random == 3)
//						{
//						cords.add(new Lake( q , w ));
//						}
//					else
//						{
//						cords.add(new Dungeon( q , w ));
//						}
//					}
//				}
//			}
		for(int i = 0; i < cords.size(); i++)
			{
			cords.get(i).generateLoot();
			}
		return cords;
		}
	public static void PrintMap()
		{
		System.out.println("       +----(MAP)----+");
		System.out.println("+---+---+---+---+---+---+---+");
		for(int i = 0; i < MainMethod.cords.size(); i++)
			{
			if(MainMethod.cords.get(i).isFound() == false)
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
					System.out.println("| " + MainMethod.cords.get(i).getPosition() + " | ");
					System.out.println("+---+---+---+---+---+---+---+");
					}
				else
					{
					System.out.print("| " + MainMethod.cords.get(i).getPosition() + " ");
					}
				}
			}
//		System.out.println(" _____");
//		System.out.println("|  N/ |");
//		System.out.println("|W O E|");
//		System.out.println("|__S__|");
		}
	}
