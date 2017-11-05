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
	/**
	 * keyRoom constructor
	 * @param x keyRoom x-coordinate
	 * @param y keyRoom y-coordinate
	 */
	public alarmRoom(int x, int y) 
	{
		super(x, y);
		this.silenced = false;
	}

	/**
	 * getX gets the location variable x
	 * @return local variable x
	 */
	public int getX()
    {
    	return x;
    }
	
	/**
	 * getY gets the location variable y
	 * @return local variable y
	 */
	public int getY()
    {
    	return y;
    }
	
	/**
	 * Print function
	 */
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
