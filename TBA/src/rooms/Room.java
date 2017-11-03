package rooms;

public abstract class Room 
{
	public boolean explored;
	public boolean inRoom;
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
	
	public void setIndex(int index) 
	{
		this.index = index;
	}
	
	public int getIndex() 
	{
		return index;
	}
	
	public abstract void print();
	
	public void print(boolean inRoom)
	{
		if (inRoom = true)
		{
			System.out.println("[ P ]");
		}
		else if (this.explored)
	    {
			System.out.print("[ E ]");
	    }
	    else
	    {
	        System.out.print("[   ]");
	    }
	}
}
