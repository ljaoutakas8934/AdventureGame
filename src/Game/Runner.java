package Game;
import People.Person;
import Rooms.Room;
import Rooms.WinningRoom;

import java.util.Scanner;

public class Runner {
	private static Board building = new Board(createBoard());
	private static String input = "";
	public static void main(String[] args)
	{
		String input = "";
		String name = "";
		// Greeting
        WinningRoom.setWin(false);
		System.out.println("Hello! What is your name?");
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		Person user = new Person(name,0,0, 1);
		user.setHP(3);


		building.getFloor(user).getRoom(user).enterRoom(user);
		boolean a;
		while (true) {
			a = turn(in, user);
			if (a)
			{
				break;
			}
			System.out.println("Turn has ended (Main)");

		}

			// add a roomAction() method in room and overwrite it. Make science, compsci, math and humanities rooms.






	}
	public static boolean move(String move, Floor floor, Person x)
	{
			System.out.println("X location: " +x.getxLoc() + " Y location: " + x.getyLoc() );
			building.getFloor(x).getRoom(x).leaveRoom(x);
			if(move.toLowerCase().equals("n"))
			{
				if (floor.canNorth(x))
				{
					x.moveNorth();
					return true;
				}
				return false;

			}
			if(move.toLowerCase().equals("s"))
			{
				if (floor.canSouth(x))
				{
					x.moveSouth();
					return true;
				}
				return false;
			}
			if(move.toLowerCase().equals("e"))
			{
				if (floor.canEast(x))
				{
					x.moveEast();
					return true;
				}

				return false;
			}
			if(move.toLowerCase().equals("w"))
			{
				if (floor.canWest(x))
				{
					x.moveWest();
					return true;
				}

				return false;
			}
			else
			{
				System.out.println("Please choose a valid move: N, S, E, W");
				return false;
			}

	}

	private static boolean turn(Scanner in, Person x)
	{
		if(x.getHP() < 1)
		{
			System.out.println("Oh no, your bad test scores made you give up!");
			System.exit(0);
		}
		clearScreen();

		input = "";
		System.out.println("This is the current floor:");
		System.out.println(building.print(Person.getFloorNumber()));
		while (!move(input,building.getFloor(x),x))
		{
			System.out.println("Where would you like to go? (N,S,E,W)");
			input = in.nextLine();
		}
		building.getFloor(x).getRoom(x).enterRoom(x);


		return WinningRoom.checkWin();
	}
	private static Floor[] createBoard ()
	{
		// Creates a room array and sets it to Floor 1
		Floor Floor1 = new Floor(new Room[8][8]);
		Floor1.fill();

		// Creates a room array and sets it to Floor 2
		Floor Floor2 = new Floor(new Room[8][8]);
		Floor2.fill();

		// Creates a floor array known as building
		Floor [] building = new Floor[2];
		// Sets the floors in the building to the 2d room array.
		building[0] = Floor1;
		building[1] = Floor2;

		return building;
	}
	private static void clearScreen()
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println("");
		}
	}
}
