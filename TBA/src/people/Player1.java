package people;

import java.util.Scanner;

/**
 * Text Based Adventure
 * @author Jaron Huang
 * 11/3/17
*/
public class Player1 implements Person
{
	private int energy;
	private static String name;
	private int positionX;
	private int positionY;
	private int location;
	public static int counter = 0;
	
	/** 
	 * Player1 constructor
	 * @param name - Takes in the name of the player.
	 */
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
	
	public static String getName()
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
	
	public void setPositionX(int positionX) 
	{
		this.positionX = positionX;
	}
	
	public int getPositionX() 
	{
		return positionX;
	}
	
	public void setPositionY(int positionY) 
	{
		this.positionY = positionY;
	}
	
	public int getPositionY() 
	{
		return positionY;
	}
	
	public void setPosition(int x, int y) 
	{
		
		this.setPositionX(x);
		this.setPositionY(y);
		this.location = x + y;
	}
	
	public int getLocation() 
	{
		return location;
	}
}
