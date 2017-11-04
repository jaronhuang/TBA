package board;

import people.Player1;
import people.Person;
import rooms.Room;

/**
 * Text Based Adventure
 * @author Jaron Huang
 * 11/3/17
*/
public class Board 
{
	 private Room[][] escmap;
	 private Player1 player;
	 
	 /**
	  * Board constructor 
	  * @param Room[][] map 
	  */
	 public Board(Room[][] escmap)
	 {
		 this.escmap = escmap;
	 }

	 /**
	  * Prints the board
	  */
	 public void printMap(Player1 player)
	 {
	    for (int i = 0; i < escmap.length; i++)
	    {
	    	for (int j = 0; j < escmap[i].length; j++)
	    	{
	    		if(i == player.getPositionX() && j == player.getPositionY())
	    		{
	    			System.out.print("[ P ]");
	    		}
	    		else
	    		{
	            	escmap[i][j].print();
	    		}
	    	}
	    }
	 }
	 public Room[][] getEscmap() 
	 {
		 return escmap;
	 }
	    
	 public Player1 getPlayer() 
	 {
		 return player;
	 }

	 public void setPlayer(Player1 player) 
	 {
		 this.player = player;
	 }
		
}
