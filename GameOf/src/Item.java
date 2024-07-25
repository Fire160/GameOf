public abstract class Item
	{
	protected String name, discription, type;
	protected int value;
	public void use()
		{
		MainMethod.cords.get(GameCommands.findSquare()).use(name);
		}
	public Item(String n, String d, int v, String t)
		{
		name = n;
		discription = d;
		value = v;
		type = t;
		}
	public Item()
		{
		name = "none";
		discription = "nothing";
		value = 0;
		type = "n";
		}
	}
