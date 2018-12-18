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
	public void enterRoom(Person x) {

		occupant = x;


	}

	public void roomAction(Person x)
	{
		System.out.println("It Looks like a locked door.");
	}

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
	public String toString ()
	{
		if (occupant == null)
		return "W";
		else return "x";
	}
	public static void setWin(boolean a)
	{
		win = a;
	}
	public static boolean checkWin()
	{

		return win;
	}

}
