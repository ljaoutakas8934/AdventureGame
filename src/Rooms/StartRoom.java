package Rooms;

import People.Person;

public class StartRoom extends Room
{
    public StartRoom()
    {

    }

    public void enterRoom(Person x)
    {

        occupant = x;

    }

    public String toString ()
    {
        if (occupant != null) {
            return "x";
        }
        else return "S";
    }

    @Override
    public void roomAction(Person x) {
        System.out.println("This is the room you start in!");
        System.out.println("It is just empty.");
    }
}
