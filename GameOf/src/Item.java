public abstract class Item
	{
	protected String name, discription;
	protected int value;
	protected abstract void use(Player person);
	public Item(String n, String d, int v)
		{
		name = n;
		discription = d;
		value = v;
		}
	public Item()
		{
		name = "default";
		}
	}
