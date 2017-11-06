package people;

import java.util.Scanner;

/**
 * Text Based Adventure
 * @author Jaron Huang
 * 11/3/17
*/
public class Player1 implements Person
{	
	private int positionX;
	private int positionY;
	private int energy;
	private int location;
	public static int counter = 0;
	
	/** 
	 * Player1 constructor
	 * @param positionX the x-position of the player
	 * @param positionY the y-position of the player
	 */
	public Player1(int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	/**
	 * calcEnergy calculates the energy remaining on the player
	 * @return returns how much energy is remaining
	 */
	public int calcEnergy()
	{
		return 100 - (counter * 5);
	}
	
	/**
	 * getEnergy gets the local variable energy
	 * @return returns local variable energy
	 */
	@Override
	public int getEnergy() 
	{
		return energy;
	}

	
	/**
	 * chooseMove asks the player where the player wants to go
	 * @return returns an integer that corresponds to the direction
	 */
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

	/**
	 * Takes parameter positionX and sets it to local variable positionX
	 * @param positionX the X-Position of the player
	 */
	public void setPositionX(int positionX)
	{
		this.positionX = positionX;
		
	}
	
	/**
	 * getPositionX gets the local variable positionX
	 * @return local variable positionX
	 */
	public int getPositionX()
	{
		return positionX;
	}
	
	/**
	 * Takes parameter positionY and sets it to local variable positionY
	 * @param positionY the Y-Position of the player
	 */
	public void setPositionY(int positionY)
	{
		this.positionY = positionY;
		
	}
	
	/**
	 * getPositionY gets the local variable positionY
	 * @return local variable positionY
	 */
	public int getPositionY()
	{
		return positionY;
	}
	
	/**
	 * setPosition takes the x and y coordinates and sets it to local variable location
	 * @param x x-coordinate
	 * @param y y-coordinate
	 */
	public void setPosition(int x, int y) 
	{
		
		this.setPositionX(x);
		this.setPositionY(y);
		this.location = x + y;
	}
	
	/**
	 * getLocation gets the local variable location
	 * @return local variable location 
	 */
	@Override
	public int getLocation() 
	{
		return location;
	}
}
