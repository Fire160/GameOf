public abstract class Item
	{
	protected String name, discription;
	protected int value;
	public void use()
		{
		MainMethod.cords.get(GameCommands.findSquare()).use(name);
		}
	public Item(String n, String d, int v)
		{
		name = n;
		discription = d;
		value = v;
		}
	public Item()
		{}
	}
