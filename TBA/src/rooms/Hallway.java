package rooms;

import people.Player1;

public class Hallway extends Room
{
	public Hallway(int x, int y)
	{
		super(x, y);
		this.explored = false;
	}
	

	public void print() 
	{
		System.out.println("[ ]");
	}
}
