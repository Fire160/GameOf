public class MapSquare
	{
	private int x;
	private int y;
	private String position;
	private boolean found;
	public MapSquare(int i, int o, String p, boolean a)
		{
		x = i;
		y = o;
		position = p;
		found = a;
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
		return found;
		}
	public void setFound(boolean found)
		{
		this.found = found;
		}
	}
