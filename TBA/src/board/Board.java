package board;

import people.Player1;
import people.Person;
import rooms.Room;

public class Board 
{
	 private Room[][] escmap;
	 private Player1 player;

	 	public Board(Room[][] escmap)
	    {
	        this.escmap = escmap;
	    }

	    public void printMap()
	    {
	    	for(Room[] row : escmap)
	        {
	    		for (Room room : row)
	            	{
	            		room.print();
	            	}
	           
	            System.out.println();
	        }
	    }
	    public Room[][] getEscmap() 
	    {
	        return escmap;
	    }

	    public void setEscmap(Room[][] escmap) 
	    {
	        this.escmap = escmap;
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
