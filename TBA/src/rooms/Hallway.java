package rooms;

public class Hallway extends Room
{
	public Hallway(int x, int y)
	{
		super(x, y);
		this.explored = false;
	}

	public void print() 
	{
		if (this.explored)
        {
            System.out.print("[ H ]");
        }
        else
        {
            System.out.print("[   ]");
        }
	}
}
