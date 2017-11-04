package rooms;

/**
 * Text Based Adventure
 * @author Jaron Huang
 * 11/3/17
*/
public class alarmRoom extends Room
{
	public static boolean silenced;
	private int x;
	private int y;
	public alarmRoom(int x, int y) 
	{
		super(x, y);
		this.silenced = false;
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
