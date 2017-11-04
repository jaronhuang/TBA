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
	Player1 player1 = new Player1(Player1.getName());
	
	/**
	 * movePlayer moves the player according to users move
	 * @param player1 the player that is being moved
	 * @param move the desired move of the player
	 */
	public static void movePlayer(Player1 player1, int move) 
	{
		if (move == 2) //n
		{
			if (player1.getPositionY()  > 0) 
			{
				player1.setPosition(player1.getPositionX(), player1.getPositionY()-1);   
			}
		} 
		else if (move == 1) //w
		{
			if (player1.getPositionX() > 0) 
			{
				player1.setPosition(player1.getPositionX()-1, player1.getPositionY());
			}
		} 
		else if (move == -2) //s
		{		
			if (player1.getPositionY() > 4)
			{
				player1.setPosition(player1.getPositionX(), player1.getPositionY()+1);    	
			}
		} 
		else if (move == -1) //e
		{
			if (player1.getPositionX() > 4) 
			{
				player1.setPosition(player1.getPositionX()+1, player1.getPositionY());
			}
		}
	}
}