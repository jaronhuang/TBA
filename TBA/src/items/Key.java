package items;

public class Key implements Items
{
	private int positionX;
	private int positionY;
	
	public Key (int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public int getLocation() 
	{
		return 0;
	}
	
}
