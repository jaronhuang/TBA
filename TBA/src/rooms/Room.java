package rooms;

public abstract class Room 
{
	public boolean explored;
	private int x;
	private int y;
	
	public Room(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.explored = false;
	}
	
	public int getX()
    {
    	return x;
    }
	
	public int getY()
    {
    	return y;
    }
	
	public abstract void print();
}
