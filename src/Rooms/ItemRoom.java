package Rooms;
import Game.Floor;
import Game.Helper;
import Items.Pencil;
import People.Person;
import Items.Item;
import java.util.Scanner;
public class ItemRoom extends Room
{
    Person occupant;
    Item item = null;
    Item temp;

    public ItemRoom(Item s)
    {
        this.item = s;
    }
    public void roomAction(Person x)
    {
        int numIn;
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("You found a "+item.getName() +" in the room. Would you like to pick it up? (yes) (no)");
        input = in.nextLine();
        if (input.toLowerCase().contains("yes"))
        {
            System.out.println("What index would you like to place the item in? (Note that if there is an item in that index, it will be dropped!");
            numIn = in.nextInt();
            if (numIn < 3)
            {

            }

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



}