package rooms;

/**
 * Text Based Adventure
 * @author Jaron Huang
 * 11/3/17
*/
public class keyRoom extends Room
{
	public static boolean found;
	private int x;
	private int y;
	public keyRoom(int x, int y) 
	{
		super(x, y);
		this.found = false;
	}
	
	public int setX(int x)
	{
		return this.x = x;
	}
	
	public int setY(int y)
	{
		return this.y = y;
	}

	public int getX()
    {
    	return x;
    }
	
	public int getY()
    {
    	return y;
    }

	@Override
	public void print() 
	{
		if(this.explored)
		{
			System.out.print("[ - ]");
		}
		else
		{
			System.out.print("[   ]");
		}
	}
	
}
