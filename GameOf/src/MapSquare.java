public abstract class MapSquare
	{
	protected int x;
	protected int y;
	protected String position;
	protected boolean isFound;
	protected boolean isLooted;
	protected abstract void run();
	protected abstract void use(String name);
	protected abstract void attack();
	protected abstract void search();
	protected abstract void enter();
	protected Item loots;
	public MapSquare()
		{
		generateLoot();
		}
	protected abstract void generateLoot();
	protected abstract void dig(boolean shovel);
	public void breakDance()
		{
		switch ((int) (Math.random() * 10))
			{
			case 2:
			case 3:
			case 4:
				{System.out.println("You shuffle in place quietly."); break;}
			case 5:
			case 6:
				{System.out.println("You bust a few moves, and feel content with your skill."); break;}
			case 7:
			case 8:
				{System.out.println("You do a couple back spins, and even some windmills. It's pretty impressive."); break;}
			case 9:
				{
				System.out.println("You perform your full routine, which you call Cosmic F's Deep Space Break. The ground shakes as you pivot all your weight on your arms,"); 
				System.out.println("and spin and jump around simultaniously. The air is whipped as your legs tear through it at break neck speed, and a sonic boom is heard.");
				System.out.println("Finally you end with a septuple headspin, defying all sense. If any had witnessed this performance, they would take you as a god.");
				MainMethod.person.damaged(-10);
				break;
				}
			default:
				{
				System.out.println("You try to bust a move, but instead you bust your booty.");
				MainMethod.person.damaged(1);
				break;
				}
			}
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
	public String getPosition()
		{
		return position;
		}
	public void setPosition(String position)
		{
		this.position = position;
		}
	public boolean isFound()
		{
		return isFound;
		}
	public void setFound(boolean isFound)
		{
		this.isFound = isFound;
		}
	public boolean isLooted()
		{
		return isLooted;
		}
	public void setLooted(boolean isLooted)
		{
		this.isLooted = isLooted;
		}
	}
