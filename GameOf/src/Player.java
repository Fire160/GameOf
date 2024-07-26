import java.util.ArrayList;

public class Player
	{
	private String name;
	private int money, x, y, attack, health;
	private ArrayList<Item> inventory;
	private Weapon eWeapon;
	public Player(String n)
		{
		name = n;
		money = 0;
		attack = 0;
		health = 20;
		x = 3;
		y = 3;
		inventory = new ArrayList<Item>();
		eWeapon = new Weapon("Fists", "I don't know how these are in your inventory, soo that's a thing.", 1, 1);
//		inventory.add(new RealItem("Nothing",":(",0));
		}
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public int getMoney()
		{
		return money;
		}
	public void setMoney(int money)
		{
		this.money = money;
		}
	public void addMoney(int mone)
		{
		System.out.println("You pick up " + mone + " coins and add them to your stash. You now have " + money + ".");
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
	public int getAttack()
		{
		return attack;
		}
	public void setAttack(int attack)
		{
		this.attack = attack;
		}
	public void printInventory()
		{
		System.out.println("+---------(" + MainMethod.person.getName() + "'s INVENTORY)---------+");
		for(int i = 0; i < inventory.size(); i++)
			{
			System.out.println(inventory.get(i).name + ": " + inventory.get(i).discription);
			}
		if(inventory.size()<1)
			{
			System.out.println("Your inventory is empty. :(");
			}
		}
	public void addInventory(Item temp)
		{
//		System.out.println("You found a " + temp.name + " and put it in your inventory.");
		inventory.add(temp);
		}
	public ArrayList<Item> getInventory()
		{
		return inventory;
		}
	public void setInventory(ArrayList<Item> inventory)
		{
		this.inventory = inventory;
		}
	public Weapon geteWeapon()
		{
		return eWeapon;
		}
	public void seteWeapon(Weapon eWeapon)
		{
		this.eWeapon = eWeapon;
		}
	public int getHealth()
		{
		return health;
		}
	public void setHealth(int health)
		{
		this.health = health;
		}
	public void damaged(int damage)
		{
		if(damage > -1)
			{
			System.out.println(name + " takes " + damage + " damage, and now has " + (health - damage));
			}
		else
			{
			System.out.println(name + " is healed for " + (-damage) + " health, and now has " + (health - damage));
			}
		health = health - damage;
		}
	}
