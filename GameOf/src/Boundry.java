public class Boundry extends MapSquare
	{
	public Boundry(int i, int o)
		{
		x = i;
		y = o;
		position = "B";
		loots = new RealItem("","",0);
		}
	protected void run()
		{
		if(!isFound)
			{
			System.out.println("You emerge from the forest at the edge of a sharp mountain face.");
			System.out.println("You can't find a way up anywhere.");
			isFound = true;
			}
		else
			{
			System.out.println("The mountains loom above you. There is no way out. You are trapped here.");
			}
		}
	protected void generateLoot()
		{
		}
	protected void dig(Player person)
		{
		
		}
	@Override
	protected void use(String name)
		{
		// TODO Auto-generated method stub
		
		}
	@Override
	protected void attack()
		{
		System.out.println("The mountains yield nothing to you. To them, you are nothing.");
		}
	@Override
	protected void search()
		{
		System.out.println("Upon further inspection, you notice that the ground seems to have shifted quickly.");
		System.out.println("You get the feeling these mountains didn't exist until recently.");
		}
	@Override
	protected void enter()
		{
		System.out.println("You attempt to climb the steep cliff in front of you.");
		System.out.println("You make some progress, but slip and fall, hurting yourself.");
		MainMethod.person.damaged(2);
		}
	@Override
	protected void dig()
		{
		// TODO Auto-generated method stub
		
		}
	}
