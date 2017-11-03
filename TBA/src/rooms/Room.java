package rooms;

import people.Player1;

public abstract class Room 
{
	public boolean explored;
	public boolean location;
	private int x;
	private int y;
	private int index;
	
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
	
	public void setIndex() 
	{
		this.index = getX() + getY();
	}
	
	public int getIndex() 
	{
		return index;
	}
	
	public abstract void print();
	
}
