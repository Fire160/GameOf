public class Lake extends MapSquare
	{
	public Lake(int i, int o)
		{
		x = i;
		y = o;
		position = "L";
		}
	protected void run()
		{
		if(isFound == false)
			{
			System.out.println("You stand on the edge of a small lake.");
			isFound = true;
			}
		else
			{
			System.out.println("You stand on the edge of a small lake.");
			}
		}
	}