package game;
import board.Board;
import people.Player1;

public class Utilities 
{
	if (move == 2) 
	{
		if (player1.getPositionY()  > 0) 
		{
			player1.setPosition(player1.getPositionX(), player1.getPositionY()-1);   
		}
	} 
	else if (move == 1) 
	{
		if (player1.getPositionX() > 0) 
		{
			player1.setPosition(player1.getPositionX()-1, player1.getPositionY());
		}
	} 
	else if (move == -2) 
	{		
		if (player1.getPositionY() < 0)
		{
			player1.setPosition(player1.getPositionX(), player1.getPositionY()+1);    	
		}
	} 
	else if (move == -1) 
	{
		if (player1.getPositionX() < 0) 
		{
			player1.setPosition(player1.getPositionX()+1, player1.getPositionY());
		}
	}
}