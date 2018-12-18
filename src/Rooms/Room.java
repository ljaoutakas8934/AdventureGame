package Rooms;
import Game.Floor;
import Game.Helper;
import People.Person;
import Items.Item;
public class Room {
	Person occupant;
	Item item;
	Item temp;
	String [] Responses = {"Looks like you stumbled onto an empty room!", "Well it seems as though there is nothing in this room.", "There is nothing in this room.", "Unfortunately there is nothing to find in this room."};
	public Room()
	{

	}
	public Room (Item s)
	{
		this.item = item;
	}


	public void use (Item y)
	{
		y.defaultAction();
	}


	/**
	 * Method controls the results when a person enters this room.
	 * @param x the Person entering
	 */
	public void enterRoom(Person x)
	{
		occupant = x;
	}

	/**
	 *  This method preforms the room action.
	 * @param x the User
	 */
	public void roomAction(Person x)
	{
		System.out.println(Responses[Helper.randomInt(0,Responses.length-1)]);
		System.out.println("\n\n");
	}
	/**
	 * Removes the player from the room.
	 * @param x
	 */
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	public String toString ()
	{
		if (occupant != null) {
			return "x";
		}
		else return " ";
	}

	public void drop(Item New, Person x)
	{
		item = New;

	}


	
}
