import java.util.ArrayList;

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
		System.out.println("You dig a random forest hole.. but why though?");
		}
	}
