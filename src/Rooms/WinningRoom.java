package Rooms;

import Game.Runner;
import Items.Item;
import People.Person;

public class WinningRoom extends Room
{
	private int code;
	private static boolean win = false;
	public WinningRoom (int code)
	{
		this.code = code;
	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	@Override
	/**
	 * Sets the occupant to the actual user.
	 */
	public void enterRoom(Person x) {

		occupant = x;


	}

	/**
	 * What happens when you actually enter the room.
	 * @param x The user entering the room.
	 */
	public void roomAction(Person x)
	{
		System.out.println("It Looks like a locked door.");
	}

	/**
	 * What happens if you use an item in the room. In this case, if it is a key with the right code, the door will open.
	 * @param a The item the person is trying to use
	 * @param x The user.
	 */
	public void use (Item a, Person x)
	{
		if (a.getCode() == code) {
			System.out.println("You open the door, and are able to go outside!");
			this.win = true;
			System.exit(0);
		}
		else
		{
			System.out.println("The door doesn't seem to want to open.");
		}

	}

	/**
	 * What is put into the printBoard.
	 * @return The letter corresponding to the name of the room.
	 */
	public String toString ()
	{
		if (occupant == null)
		return "W";
		else return "x";
	}

	/**
	 * Used to initialize the win condition.
	 * @param a If the game should be over.
	 */
	public static void setWin(boolean a)
	{
		win = a;
	}

	/**
	 * Checks if the win condition is true or false.
	 * @return A boolean signifying if the game has been won.
	 */
	public static boolean checkWin()
	{

		return win;
	}

}
