public class FoodItem extends Item
	{
	protected int heal;
	public FoodItem(String n, String d, int v, int h)
		{
		name = n;
		discription = d;
		value = v;
		heal = h;
		type = "f";
		}
	public void eat(int i)
		{
		if(i == 0)
			{
			System.out.println("The " + name + " was not very filling.");
			}
		else if(i < 0)
			{
			System.out.println("You ate the " + name + ". It dealt " + heal + " damage.");
			}
		else
			{
			System.out.println("You ate the " + name + ". It healed " + heal + " HP.");
			}
		
		MainMethod.person.setHealth(MainMethod.person.getHealth() + heal);
		MainMethod.person.getInventory().remove(i);
		}
	}