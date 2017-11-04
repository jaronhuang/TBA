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
	  * @param Room[][] escmap 
	  */
	 public Board(Room[][] escmap)
	 {
		 this.escmap = escmap;
	 }

	 /**
	  * printMap Prints the board
	  * @param player the constructed player of the game
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
	 
	 /**
	  * getEscmap gets the local variable escmap
	  * @return returns local variable escmap
	  */
	 public Room[][] getEscmap() 
	 {
		 return escmap;
	 }
	 
	 /**
	  * getPlayer gets the local variable player
	  * @return returns local variable player
	  */
	 public Player1 getPlayer() 
	 {
		 return player;
	 }
	 
	 /**
	  * setPlayer takes in parameter player and sets it to local variable player
	  * @param player the constructed player of the game
	  */
	 public void setPlayer(Player1 player) 
	 {
		 this.player = player;
	 }
		
}
