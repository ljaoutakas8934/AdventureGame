package Rooms;
import Items.Item;
import Items.key;
import People.Person;

public class StairwayRoom extends Room
{
    private int code;
    private int targetFloor;
    public StairwayRoom(int code, int targetFloor)
    {
        this.code = code;
        this.targetFloor = targetFloor;
    }

    /**
     * Sets the person in the room to x.
     * @param x The user.
     */
    public void enterRoom(Person x)
    {

        occupant = x;
    }

    /**
     * What prints when you enter a room.
     * @param x The user in the room
     */
    public void roomAction(Person x)
    {
        System.out.println("It Looks like a locked door. If only there was some way to open it....");
    }

    public String toString()
    {
        if (occupant != null) {
            return "x";
        }
        else return "S";
    }
    public void use (Item a, Person x)
    {
        if (a.getCode() == code) {
            System.out.println("You open the door, and take the stairs up to the second floor!");
            x.setFloor(targetFloor);
        }
        else
        {
            System.out.println("The door doesn't seem to want to open.");
        }

    }




}
