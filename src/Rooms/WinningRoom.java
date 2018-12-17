package Rooms;

import Game.Runner;
import People.Person;

public class WinningRoom extends Room
{
	private static boolean win = false;


	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	@Override
	public void enterRoom(Person x) {

		occupant = x;
		this.win = true;
		System.out.println("You found the winning room! Ten points for Gryffindor.");
	}
	public String toString ()
	{
		return "W";
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
