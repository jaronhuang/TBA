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
	/**
	 * keyRoom constructor
	 * @param x keyRoom x-coordinate
	 * @param y keyRoom y-coordinate
	 */
	public keyRoom(int x, int y) 
	{
		super(x, y);
		this.found = false;
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
	 * Prints function
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
