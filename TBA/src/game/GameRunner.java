package game;

import java.util.Scanner;

import board.Board;
import rooms.Room;
import rooms.alarmRoom;
import rooms.keyRoom;
import people.Player1;

/**
 * Text Based Adventure
 * @author Jaron Huang
 * 11/3/17
*/
public class GameRunner 
{

	public static void main(String[] args)
	{
		Room[][] map = new Room[5][5]; 
		Player1 player1 = new Player1(0,0);
		
		for(int i = 0; i < map.length; i++)
		{
			Room[] row = map[i];
			for(int j = 0; j < row.length; j++)
			{
				row[j] = new keyRoom(i, j);
			}
		}
		
		Board escmap = new Board(map);
		System.out.println("Welcome to Escape From Prison." + "\nIn order to win you must find the alarm room and silence the alarm" + "." 
				+ "\nThen you have to find the key and move to the opposite side of the board."
				+ "\nYou begin with 100 energy each move takes 5 energy" + "."
				+ "\nMove at your own risk.");
		System.out.println("What's your name?");
		Scanner in = new Scanner(System.in);
		String pName = in.nextLine();
		player1.setPosition(0, 0);
		System.out.println("You are now in prison, " + pName + "." + "\nTry and escape." );
		
		int randx = (int)(Math.random() * 5);
        int randy = (int)(Math.random() * 5);
        int randxk = (int)(Math.random() * 5);
        if (randxk == randx)
        {
        	randxk = (int)(Math.random() * 5);
        }
        int randyk = (int)(Math.random() * 5);
        if (randyk == randy)
        {
        	randyk = (int)(Math.random() * 5);
        }

		boolean gameOn = true;
		while(gameOn)
		{
			escmap.printMap(player1); 
			int move = Player1.chooseMove();
			Utilities.movePlayer(player1, move);
			
			if ((player1.getPositionX() == randx) && player1.getPositionY() == randy)
            {
            	alarmRoom.silenced = true;
            	System.out.println("You silenced the alarm!");
            }
            
            if ((player1.getPositionX() == randxk) && player1.getPositionY() == randyk)
            {
            	keyRoom.found = true;
            	System.out.println("You found the key!");
            }
            
            if ((player1.getPositionX() == 4) && (player1.getPositionY() == 4))
            {
            	gameOn = false;
            	if (alarmRoom.silenced && keyRoom.found)
            	{
            		System.out.println("Congrats " + pName + "! " + "You're free, but you're on FBI's most wanted list now.");
            	}
            	else if(!alarmRoom.silenced && keyRoom.found)
            	{
            		System.out.println("You failed, you triggered the alarm. Into the hole you go.");
            	}
            	else if(alarmRoom.silenced && !keyRoom.found)
            	{
            		System.out.println("You failed, you couldn't open the door and the guards found you. Into the hole you go.");
            	}
            }
            if (player1.calcEnergy() == 0)
            {
            	gameOn = false;
            	System.out.println("You ran out of energy and was found before you escaped.");
            }
		}
		in.close(); 
	}
}
