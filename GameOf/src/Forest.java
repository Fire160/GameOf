public class Forest extends MapSquare
	{
	public Forest(int i, int o)
		{
		x = i;
		y = o;
		position = "F";
		}
	protected void run()
		{
		if(isFound == false)
			{
			System.out.println("You stand in a forest. You hear birds chirping.");
			isFound = true;
			}
		else
			{
			System.out.println("You stand in a forest. You hear birds chirping.");
			}
		}
	}
