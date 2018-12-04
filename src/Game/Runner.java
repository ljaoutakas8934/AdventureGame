package Game;
import Game.Floor;
import People.Person;
import Rooms.PartyRoom;
import Rooms.Room;
import Rooms.WinningRoom;

import java.util.Scanner;

public class Runner {

	private static boolean gameOn = true;

	public static void main(String[] args)
	{
		Floor floor1 = new Floor(new Room [5] [5]);
		Floor floor2 = new Floor(new Room [5] [5]);
		Floor floor3 = new Floor(new Room [5] [5]);
		Floor floor4 = new Floor(new Room [5] [5]);
		Floor [] temp = {floor1, floor2, floor3,floor4};
		Board building = new Board(temp);
		System.out.println(printBoard(building, 4));

	}
	public boolean moveIsValid(String move)
	{
		boolean output = false;



		return output;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	public static String printBoard(Board x, int floor)
	{
		return x.print(floor);
	}
	


}
