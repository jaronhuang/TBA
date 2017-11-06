package board;

import people.Player1;
import rooms.Room;

/**
 * Text Based Adventure
 * @author Jaron Huang
 * 11/3/17
*/
public class Board 
{

	private Room[][] escmap;
	
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
		for(int i = 0; i < escmap.length; i++) 
        {
            for (int j = 0; j < escmap[i].length; j++)
            {
            	if(player.getPositionX() == i && player.getPositionY() == j)
            	{
            		System.out.print("[ P ]");
            	}
            	else
            	{
            		escmap[i][j].print(); 
            	}
            }
            System.out.println();
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
	  * setMap sets the local variable escmap to parameter escmap
	  * @return returns local variable escmap
	  */
	public void setMap(Room[][] escmap)
	{
		this.escmap = escmap;
	}
}
	

