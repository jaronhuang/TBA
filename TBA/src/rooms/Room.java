package rooms;

public abstract class Room 
{
	public boolean explored;
	public boolean location;
	private int x;
	private int y;
	
	public Room(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.explored = false;
		this.location = false;
	}
	
	public int getX()
    {
    	return x;
    }
	
	public int getY()
    {
    	return y;
    }
	
	public void print()
	{
		if (this.location)
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
