package Game;
import Items.Pencil;
import People.Person;
import Rooms.*;

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








	}

	/**
	 * The method to process the user's input.
	 * @param move The original input.
	 * @param floor The floor that the user is on
	 * @param x The user.
	 * @return A boolean signifying if the user moved.
	 */
	public static boolean move(String move, Floor floor, Person x)
	{
			System.out.println("X location: " +x.getxLoc() + " Y location: " + x.getyLoc() + " Floor: " + x.getFloorNumber());
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
			if(move.toLowerCase().contains("inventory"))
			{
				Scanner in = new Scanner(System.in);
				System.out.println(x.printInventory());
				System.out.println("To see the options for an item, type the item's index number. Otherwise type exit to go back.");

					input = in.nextLine();
					if (input.toLowerCase().equals("exit"))
					{
						return false;
					}
					if (input.equals("0"))
					{
						inv (0, x, in,building.getFloor(x).getRoom(x));
					}
					if (input.equals("1"))
					{
						inv (1, x, in, building.getFloor(x).getRoom(x));
					}
					if (input.equals("2"))
					{
						inv (2, x, in, building.getFloor(x).getRoom(x));
					}
				return false;
			}
			if(move.toLowerCase().contains("help"))
			{
				System.out.println("Help:");
				System.out.println("To check your inventory, type:");
				System.out.println("'inventory'");
				System.out.println("To move, type:");
				System.out.println("'N' for north, 'S' for south, 'E' for east, and 'W'for west.");
				return false;
			}
			else
			{
				System.out.println("Please choose a valid move: N, S, E, W");

				return false;
			}

	}

	/**
	 * The turn method that repeats in the main method.
	 * @param in The scanner
	 * @param x The user
	 * @return A boolean that says if the person has won.
	 */
	private static boolean turn(Scanner in, Person x)
	{
		if(x.getHP() < 1)
		{
			System.out.println("Oh no, your bad test scores made you give up!");
			System.exit(0);
		}
		clearScreen(95);

		input = "";
		System.out.println("This is the current floor:");
		System.out.println(building.print(Person.getFloorNumber()));
		building.getFloor(x).getRoom(x).roomAction(x);
		while (!move(input,building.getFloor(x),x))
		{
			input = in.nextLine();
		}
		building.getFloor(x).getRoom(x).enterRoom(x);


		return WinningRoom.checkWin();
	}

	/**
	 * Creates the actual board.
	 * @return a Floor[] that is the board.
	 */
	private static Floor[] createBoard ()
	{

		// Creates and fills a floor with empty rooms
		Floor Floor1 = new Floor(new Room[8][8]);
		Floor1.fill();
		Floor1.addRoom(new ChemistryRoom(),3,3);
		Floor1.addRoom(new StartRoom(), 0,0);
		Floor1.addRoom(new Room(new Pencil()),2,4);
		Floor1.addRoom(new StairwayRoom(1,2),5,7);
		// Adds rooms to Floor 1





		// Creates a room array and sets it to Floor 2
		Floor Floor2 = new Floor(new Room[8][8]);
		Floor2.fill();
		Floor2.addRoom(new MathRoom(),3,3);
		Floor2.addRoom(new WinningRoom(2),1,1);




		// Creates a floor array known as building
		Floor [] building = new Floor[3];

		// Sets the floors in the building to the 2d room array.
		building[1] = Floor1;
		building[2] = Floor2;

		return building;
	}

	/**
	 * Spams the runner with blank lines.
	 */
	private static void clearScreen()
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println("");
		}
	}

	private static void clearScreen( int x)
	{
		for (int i = 0; i < x; i++)
		{
			System.out.println("");
		}
	}


	/**
	 * Inventory method.
	 * @param index The index of inventory to be edited.
	 * @param x The user.
	 * @param in The scanner.
	 * @param room The current room.
	 */
	private static void inv (int index, Person x, Scanner in, Room room)
	{
		if (x.getItem(index) != null) {
			System.out.println("You have selected the '" + x.getItem(index).getName() + "'");
			System.out.println("Would you like to (a) consume or (b) use or (c) drop it? (Press enter twice to lock in your answer)");
			input = in.nextLine();
			if (input.toLowerCase().equals("a")) x.getItem(index).consume();
			if (input.toLowerCase().equals("b")) room.use(x.getItem(index), x);
			if (input.toLowerCase().equals("c")) {
				room.drop(x.getItem(index), x);
				x.setItem(null,index);
			}
		}
		else
		{
			System.out.println("There is nothing in this space. Press enter to continue.");
		}
	}
}
