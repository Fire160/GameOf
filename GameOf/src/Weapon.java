import java.util.Scanner;

public class Weapon extends Item
	{
	protected int attack;
	public Weapon(String n, String d, int v,int h)
		{
		name = n;
		discription = d;
		attack = h;
		value = v;
		type = "w";
		}
	protected void use(Player person, int i)
		{
		Scanner things = new Scanner(System.in);
		System.out.println("Are you sure you wish to commit Seppuku?");
		String answer = things.nextLine().toLowerCase();
		if(answer.contains("yes") || answer.contains("yeah") || answer.contains("ok"))
			{
			System.out.println("You plunge the " + name + " into your chest.");
			System.out.println("You have brought honor to your family.");
			person.setHealth(0);
			}
		else
			{
			System.out.println("You are a coward and have brought shame upon your family.");
			}
		things.close();
		}
	}
