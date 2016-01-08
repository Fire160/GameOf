public class Player
	{
	private String name;
	private int money, x, y;
	public Player(String n)
		{
		name = n;
		money = 0;
		x = 4;
		y = 4;
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
	}
