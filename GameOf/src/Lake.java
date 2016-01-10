import java.util.ArrayList;

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
	protected void generateLoot()
		{
		ArrayList<Item> temp = new ArrayList<Item>();
		temp.add(new FoodItem("Berry","A delicious looking berry. But looks can be decieving.",0, 10));
		temp.add(new FoodItem("Berry","A delicious looking berry. But looks can be decieving",0, -20));
		temp.add(new Weapon("Stick","A wood stick....",3,2));
		int rando = (int) (Math.random() * 3);
		loots = (Item) temp.get(rando);
		}
	protected void dig(Player person)
		{
		
		}
	}