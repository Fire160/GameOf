public class FoodItem extends Item
	{
	protected int heal;
	public FoodItem(String n, String d, int v, int h)
		{
		name = n;
		discription = d;
		value = v;
		heal = h;
		}
	public void use(Player person)
		{
		System.out.println("You ate the " + name + ". It healed " + heal + " HP.");
		person.setHealth(person.getHealth() + heal);
		}
	}