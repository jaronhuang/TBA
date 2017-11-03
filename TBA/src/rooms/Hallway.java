package rooms;

import people.Player1;

public class Hallway extends Room
{
	public Hallway(int x, int y)
	{
		super(x, y);
		this.explored = false;
		this.location = false;
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
