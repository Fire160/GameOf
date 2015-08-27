import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class GameOfMaps
	{
	private int x;
	private int y;
	private String position;
	private boolean found;
	public GameOfMaps(int i, int o, String p, boolean a)
		{
		x = i;
		y = o;
		position = p;
		found = a;
		}
	public static ArrayList<GameOfMaps> cords = new ArrayList<GameOfMaps>();
	public static void MapMaker()
		{
		for(int q = 0; q < 5; q++)
			{
			for(int w = 0; w < 5; w++)
				{
				cords.add(new GameOfMaps( q , w , "Default", false));
				}
			}
		cords.get(0).setPosition("F");
		cords.get(1).setPosition("F");
		cords.get(2).setPosition("F");
		cords.get(3).setPosition("F");
		cords.get(4).setPosition("F");
		
		cords.get(5).setPosition("F");
		cords.get(6).setPosition("F");
		cords.get(7).setPosition("F");
		cords.get(8).setPosition("F");
		cords.get(9).setPosition("F");
		
		cords.get(10).setPosition("F");
		cords.get(11).setPosition("F");
		cords.get(12).setPosition("S");
		cords.get(13).setPosition("F");
		cords.get(14).setPosition("F");
		
		cords.get(15).setPosition("F");
		cords.get(16).setPosition("F");
		cords.get(17).setPosition("F");
		cords.get(18).setPosition("F");
		cords.get(19).setPosition("F");
		
		cords.get(20).setPosition("F");
		cords.get(21).setPosition("F");
		cords.get(22).setPosition("F");
		cords.get(23).setPosition("F");
		cords.get(24).setPosition("F");
		}
	public static void PrintMap()
		{
		System.out.println("+---+---+---+---+---+");
		for(int i = 0; i < cords.size(); i++)
			{
			if(cords.get(i).isFound() == false)
				{
				if(i %5 == 4)
					{
					System.out.println("| ? | ");
					System.out.println("+---+---+---+---+---+");
					}
				else
					{
					System.out.print("| ? ");
					}
				}
			else
				{
				if(i %5 == 4)
					{
					System.out.println("| " + cords.get(i).getPosition() + " | ");
					System.out.println("+---+---+---+---+---+");
					}
				else
					{
					System.out.print("| " + cords.get(i).getPosition() + " ");
					}
				}
			}

		}
	public int getX()
		{
		return x;
		}
	public void setX(int x)
		{
		this.x = x;
		}
	public int getY()
		{
		return y;
		}
	public void setY(int y)
		{
		this.y = y;
		}
	public String getPosition()
		{
		return position;
		}
	public void setPosition(String position)
		{
		this.position = position;
		}
	public boolean isFound()
		{
		return found;
		}
	public void setFound(boolean found)
		{
		this.found = found;
		}

	}
