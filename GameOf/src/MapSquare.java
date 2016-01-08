public abstract class MapSquare
	{
	protected int x;
	protected int y;
	protected String position;
	protected boolean found;
	protected abstract void run();
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
