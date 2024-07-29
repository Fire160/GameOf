

public class Village extends MapSquare
	{
	public Village(int i, int o)
		{
		x = i;
		y = o;
		position = "V";
		}
	protected void run()
		{
		if(isFound)
			{
			System.out.println("You arrive .");
			System.out.println("You have no recolection of how you got here.");
			System.out.println("Light streams down all around you.");
			
			}
		else
			{
			System.out.println("You come out of the forest into a small village. It is quiet here, and a few villagers mill about.");
			System.out.println("");
			isFound = true;
			}
		}
	protected void use(String name)
		{
		
		}
	protected void attack()
		{
		
		}
	protected void search()
		{
		
		}
	protected void enter()
		{
		
		}
	protected void generateLoot()
		{
		
		}
	protected void dig(boolean shovel)
		{
		
		}
	protected void makeCharacters()
		{
		characters.add(new Player("Picet",  5 , 20 , 1, x, y));
		}
	}
