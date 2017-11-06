package rooms;

/**
 * Text Based Adventure
 * @author Jaron Huang
 * 11/3/17
*/
public abstract class Room 
{
	public boolean explored;
	private int x;
	private int y;
	
	/**
	 * Room constructor
	 * @param x x-coordinate of the room
	 * @param y y-coordinate of the room
	 */
	public Room(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.explored = false;
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
	 * abstract class method
	 */
	public abstract void print();

	
}
