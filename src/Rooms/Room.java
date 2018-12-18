package Rooms;
import Game.Floor;
import Game.Helper;
import Items.Pencil;
import People.Person;
import Items.Item;
import java.util.Scanner;
public class Room {
	Person occupant;
	Item item = null;

	String [] Responses = {"Looks like you stumbled onto an empty room!", "Well it seems as though there is nothing in this room.", "There is nothing in this room.", "Unfortunately there is nothing to find in this room."};
	public Room ()
	{

	}

	public Room(Item s)
	{
		this.item = s;
	}
	public void roomAction(Person x)
	{
		if (item != null) {
			int numIn;
			String input;
			Scanner in = new Scanner(System.in);
			System.out.println("You found a " + item.getName() + " in the room. Would you like to pick it up? (yes) (no)");
			input = in.nextLine();
			if (input.toLowerCase().contains("yes")) {
				System.out.println("What index would you like to place the item in? (Note that if there is an item in that index, it will be replaced!");
				numIn = in.nextInt();
				if (numIn < 3) {
					x.setItem(item, numIn);
					item = null;
				} else {
					System.out.println(numIn + " is not a valid index. Please step out of the room and come back in.");
				}

			}
		}
		else
		{
			System.out.println(Responses[Helper.randomInt(0, Responses.length - 1)]);
			System.out.println("\n\n");
		}
	}

	public void enterRoom(Person x)
	{
		occupant = x;
	}

	public void leaveRoom(Person x)
	{
		occupant = null;
	}

	public String toString()
	{
		if (occupant != null) {
			return "x";
		}
		if (item == null)
			return " ";
		else return "i";
	}

	public void use(Item a)
	{
		a.defaultAction();
	}

	public void drop(Item New, Person x)
	{
		if (item == null)
			item = New;

		else
			System.out.println("There is already an item here!");

	}




	
}
