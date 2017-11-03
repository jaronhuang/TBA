package rooms;

public class alarmRoom 
{
	private int x;
	private int y;
	public boolean explored;
	
	public alarmRoom(int x, int y) 
	{
		this.x = x;
		this.y = y;
		this.explored = false;
	}
	
	public void print()
	{
		if(this.explored)
		{
			System.out.println("[ E ]");
		}
		else
		{
			System.out.println("[  ]");
		}
	}

}
