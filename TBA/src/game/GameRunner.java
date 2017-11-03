package game;

import java.util.Scanner;

import board.Board;
import people.Person;
import people.Player1;
import rooms.Room;

public class GameRunner 
{
	public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
        	for (int i = 0; i<row.length;i++)
        	{
        		boolean[] doors = {true,true,true,true};
	            Person[] person = {};
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
        Player1 player1 = new Player1(pName);
        player1.setPosition(0, 0);
        escmap.setPlayer(player1);
        System.out.println("You are now in prison, " + pName + "." + "\nTry and escape." );
        boolean gameOn = true;
        while(gameOn)
        {
            escmap.printMap();
            int move = Player1.chooseMove();
            Utilities.movePlayer(escmap, player1,move);	
            
            if ((player1.getPositionX() == 4) && (player1.getPositionY() == 4))
            {
            	gameOn = false;
            	//add if statement to check if alarm is silenced + key is found.
            	//System.out.println("Congrats! You're free, but now on FBI's most wanted list");
            	//else
            	//System.out.println("You've failed. Into the hole you go.");
            }
            	
        }
        in.close();      
        
    }
}
