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
		Board building = createBoard();
		System.out.println(building.print(1));
		System.out.println(building.print(2));
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

	public static Board createBoard ()
	{


		// Creates a 2d array of Rooms for floor 1
		Room [] [] FloorA = new Room [2] [2];
		FloorA [0] [0] = new WinningRoom(0,0);
		FloorA [0] [1] = new Room(0,1);
		FloorA [1] [0] = new Room(1,0);
		FloorA [1] [1] = new Room(1,1);
		Floor Floor1 = new Floor(FloorA);

		Room [] [] FloorB = new Room [2] [2];
		FloorB [0] [0] = new Room(0,0);
		FloorB [0] [1] = new WinningRoom(0,1);
		FloorB [1] [0] = new Room(1,0);
		FloorB [1] [1] = new Room(1,1);
		Floor Floor2 = new Floor(FloorB);



		// Creates a floor array known as building
		Floor [] building = new Floor[5];
		// Sets the floors in the building to the 2d room array.
		building[1] = Floor1;
		building[2] = Floor2;

		return new Board(building);
	}
}
