package people;

import java.util.Scanner;

public class Player1 implements Person
{
	private int energy;
	private String name;
	private int positionX;
	private int positionY;
	private int location;
	public static int counter = 0;
	
	public Player1(String name)
	{
		this.name = name;
		this.energy = getEnergy();	
	}
	
	public int calcEnergy()
	{
		return 100 - (counter * 5);
	}
	
	public int getEnergy()
	{
		return energy;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static int chooseMove()
	{
		System.out.println("Do you want to move N, W, S, or E?");
		Scanner cMove = new Scanner(System.in);
		String ans = cMove.nextLine();
		counter++;
		if ((ans.toLowerCase()).equals("n"))
		{
			return 1;
		}
		if ((ans.toLowerCase()).equals("w"))
		{
			return 2;
		}
		if ((ans.toLowerCase()).equals("s"))
		{
			return -1;
		}
		if ((ans.toLowerCase()).equals("e"))
		{
			return -2;
		}
		return 0;
	}
	
	public int getLocation() 
	{
		return location;
	}
	
	public void setLocation(int location) 
	{
		this.location = location;
	}
	
	public int getPositionX() 
	{
		return positionX;
	}
	
	public void setPositionX(int positionX) 
	{
		this.positionX = positionX;
	}
	
	public int getPositionY() 
	{
		return positionY;
	}
	public void setPositionY(int positionY) 
	{
		this.positionY = positionY;
	}
	
	public void setPosition(int x, int y) 
	{
		
		this.setPositionX(x);
		this.setPositionY(y);
		
		this.location = x + y;
		
	}

	public void printOut() 
	{
		System.out.print("[ P ]");
	}
	
}