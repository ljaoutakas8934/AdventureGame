package Game;
import Game.Floor;
import People.Person;
import Rooms.PartyRoom;
import Rooms.Room;
import Rooms.WinningRoom;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Runner {
	private static boolean gameOn = true;
	private static Board building = new Board(createBoard());
	public static void main(String[] args)
	{
		String input = "";
		String name = "";
		// Greeting

		System.out.println("Hello! What is your name?");
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		Person user = new Person(name,0,0, 0);
		clearScreen();
		System.out.println("Ok");

		boolean a = false;
		while (true)
		{
			a = turn(in);
			if (a = true)
				break;
		}







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
	private static boolean turn(Scanner in)
	{
		clearScreen();
		System.out.println("This is the current floor:");
		System.out.println(building.print(Person.getFloor()));

		if (WinningRoom.checkWin())
		{
			return true;
		}


		return false;
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
		Floor [] building = new Floor[5];
		// Sets the floors in the building to the 2d room array.
		building[1] = Floor1;
		building[2] = Floor2;

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
