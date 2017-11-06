package game;
import board.Board;
import people.Player1;

/**
 * Text Based Adventure
 * @author Jaron Huang
 * 11/3/17
*/
public class Utilities 
{
	
	/**
	 * movePlayer moves the player according to users move
	 * @param player1 the player that is being moved
	 * @param move the desired move of the player
	 */
	public static void movePlayer(Player1 player1, int move) 
	{
		if(move == 2 && player1.getPositionY() > 0) //w
		{
			player1.setPositionY(player1.getPositionY() - 1);
			System.out.println("You have " + player1.calcEnergy() + " energy left.");
		}
		if(move == -2 && player1.getPositionY() < 4) //e
		{
			player1.setPositionY(player1.getPositionY() + 1);
			System.out.println("You have " + player1.calcEnergy() + " energy left.");
		}
		if(move == 1 && player1.getPositionX() > 0) //n
		{
			player1.setPositionX(player1.getPositionX() - 1);
			System.out.println("You have " + player1.calcEnergy() + " energy left.");
		}
		if(move == -1 && player1.getPositionX() < 4) //s
		{
			player1.setPositionX(player1.getPositionX() + 1);
			System.out.println("You have " + player1.calcEnergy() + " energy left.");
		}
	}
}